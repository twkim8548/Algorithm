import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())
        val array = IntArray(6) { token.nextToken().toInt() }

        if (array.sum() == 0) {
            break
        }

        val sum = array.sum() - array.max() - array.min()
        val answer = sum / 4.0
        if (sum % 4 > 0) {
            bw.write("${sum / 4.0}\n")
        } else {
            bw.write("${sum / 4}\n")
        }
    }

    bw.flush()
    bw.close()
}
