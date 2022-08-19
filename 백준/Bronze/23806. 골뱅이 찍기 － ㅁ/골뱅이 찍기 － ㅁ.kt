import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 0 until n * 5) {
        if (i < n || i >= n * 5 - n) {
            for (j in 0 until n * 5) {
                bw.write("@")
            }
        } else {
            repeat(n) {
                bw.write("@")
            }
            repeat(n*5 - n*2) {
                bw.write(" ")
            }
            repeat(n) {
                bw.write("@")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()

    br.close()
}