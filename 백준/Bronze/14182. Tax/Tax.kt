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

    while (true) {
        val n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        if (n > 5000000) {
            bw.write("${(n * 0.8).toInt()}\n")
        } else if (n >1000000) {
            bw.write("${(n * 0.9).toInt()}\n")
        } else {
            bw.write("$n\n")
        }
    }
    bw.flush()
    bw.close()
}
