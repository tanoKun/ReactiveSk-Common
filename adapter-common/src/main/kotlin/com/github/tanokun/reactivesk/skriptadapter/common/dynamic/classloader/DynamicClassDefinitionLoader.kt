package com.github.tanokun.reactivesk.skriptadapter.common.dynamic.classloader

import com.github.tanokun.reactivesk.compiler.frontend.parser.DynamicClassDefinitionIndentLexer
import com.github.tanokun.reactivesk.compiler.frontend.parser.DynamicClassDefinitionVisitor
import com.github.tanokun.reactivesk.compiler.frontend.parser.antlr.DynamicClassDefinitionParser
import com.github.tanokun.reactivesk.lang.ClassDefinition
import com.github.tanokun.reactivesk.lang.Identifier
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

/**
 * 動的クラス定義ローダーです。
 * 指定フォルダ内のスクリプトファイルを解析してクラス定義をキャッシュします。
 *
 * @property definitions キャッシュされたクラス定義のマップ
 */
class DynamicClassDefinitionLoader {
    private val definitions = mutableMapOf<Identifier, ClassDefinition>()

    /**
     * 指定フォルダ配下のすべての ".sk" ファイルを読み込み解析して定義をキャッシュします。
     *
     * @param folder 検索対象のフォルダ
     *
     * @return なし
     */
    fun loadAllClassesFrom(folder: File) {
        clear()
        folder.walkTopDown().filter { it.isFile && it.extension == "sk" }.forEach { file ->
            try {
                parseAndCacheFile(file)
            } catch (e: Exception) {
                System.err.println("Failed to parse file ${file.name}: ${e.message}")
            }
        }
    }

    /**
     * 解析結果をキャッシュに追加します。既に同名の定義が存在する場合は上書きします。
     *
     * @param file 解析対象のファイル
     *
     * @return なし
     */
    private fun parseAndCacheFile(file: File) {
        val definitionsInFile = parseSingleFile(file)
        definitionsInFile.forEach { def ->
            if (definitions.containsKey(def.className)) {
                System.err.println("Warning: Duplicate class definition for '${def.className}'. The definition from '${file.name}' will be used.")
            }

            definitions[def.className] = def
        }
    }

    /**
     * キャッシュされているすべてのクラス定義をリストで返します。
     *
     * @return キャッシュされている `List<ClassDefinition>`
     */
    fun getAllDefinitions(): List<ClassDefinition> {
        return definitions.values.toList()
    }

    /**
     * 指定したクラス名に対応するクラス定義を返します。
     *
     * @param className 検索するクラス名を表す [Identifier]
     *
     * @return 見つかった場合は対応する `ClassDefinition`、見つからない場合は null
     */
    fun getClassDefinition(className: Identifier): ClassDefinition? = definitions[className]

    /**
     * 単一ファイルを解析してそのファイル内のクラス定義一覧を返します。
     *
     * @param file 解析対象のファイル
     *
     * @return ファイル内に含まれる `List<ClassDefinition>`
     */
    private fun parseSingleFile(file: File): List<ClassDefinition> {
        val input = CharStreams.fromPath(file.toPath())
        val lexer = DynamicClassDefinitionIndentLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = DynamicClassDefinitionParser(tokens)
        val visitor = DynamicClassDefinitionVisitor()

        return visitor.visitProgram(parser.program())
    }

    /**
     * キャッシュをクリアします。
     *
     * @return なし
     */
    private fun clear() {
        definitions.clear()
    }
}
