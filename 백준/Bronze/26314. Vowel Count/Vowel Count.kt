import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.min
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val str = br.readLine()
        var vowels = 0
        var another = 0

        str.forEach {
            if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
                vowels++
            } else {
                another++
            }
        }

        if (vowels > another) {
            bw.write("$str\n1\n")
        } else {
            bw.write("$str\n0\n")
        }

    }

    bw.flush()
    bw.close()
}
