import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 0 until 5 * n) {
        if (i > n - 1 && i < 5 * n - n) {
            for (j in 0 until n) {
                bw.write("@")
            }
        } else {
            for (j in 0 until 5 * n) {
                bw.write("@")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
