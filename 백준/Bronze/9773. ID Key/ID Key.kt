import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val str = br.readLine()

        var a = 0
        str.forEach {
            a += it.toString().toInt()
        }

        val b = str.substring(10).toInt() * 10
        val answer = (a + b)

        if (answer < 1000) {
            bw.write("${answer + 1000}\n")
        } else if (answer > 9999) {
            bw.write("${answer.toString().substring(answer.toString().length - 4, answer.toString().length)}\n")
        } else {
            bw.write("$answer\n")
        }
    }

    bw.flush()
    bw.close()
}
