import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val code = br.readLine()
    val answer = mutableListOf<String>()

    repeat(br.readLine().toInt()) {
        val scanner = br.readLine()
        var isCorrect = true
        code.forEachIndexed { index, c ->
            if (c != '*') {
                if (scanner[index] != c) {
                    isCorrect = false
                }
            }
        }
        if (isCorrect) {
            answer.add(scanner)
        }
    }

    bw.write("${answer.size}\n")
    answer.forEach {
        bw.write("${it}\n")
    }

    bw.flush()
    bw.close()
}