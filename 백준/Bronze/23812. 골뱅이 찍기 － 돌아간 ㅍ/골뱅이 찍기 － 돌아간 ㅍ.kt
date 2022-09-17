import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var isBlank = true
    for (i in 0 until 5) {
        for (j in 0 until n) {
            if (!isBlank) {
                for (k in 0 until n * 5) {
                    bw.write("@")
                }
            } else {
                for (k in 0 until n) {
                    bw.write("@")
                }
                for (k in 0 until n * 3) {
                    bw.write(" ")
                }
                for (k in 0 until n) {
                    bw.write("@")
                }
            }
            bw.write("\n")
        }
        isBlank = !isBlank

    }

    bw.flush()
    bw.close()

    br.close()
}
