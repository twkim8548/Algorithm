import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 0 until n * 5) {
        if (i < n * 4) {
            for (j in 0 until n) {
                bw.write("@")
            }
        } else {
            for (j in 0 until n * 5) {
                bw.write("@")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()

    br.close()
}