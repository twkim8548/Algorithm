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

    val token = StringTokenizer(br.readLine())
    var answer = 5000
    while (token.hasMoreTokens()) {
        when(token.nextToken().toInt()) {
            1 -> {
                answer -= 500
            }
            2 -> {
                answer -= 800
            }
            3-> {
                answer -= 1000
            }
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}