import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val message = br.readLine()

    var num = 1
    val token = StringTokenizer(message)

    repeat(n) {
        val word = token.nextToken()
        if (num <= word.length) {
            bw.write("${word[num - 1]}")
        } else {
            bw.write(" ")
        }
        num = word.length
    }

    bw.flush()
    bw.close()
}