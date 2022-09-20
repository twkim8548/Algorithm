import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var cnt = 1
    var isMax = false

    for (i in 0 until n * 2 - 1) {
        for (j in 0 until cnt) {
            bw.write("*")
        }
        for (j in 0 until n - cnt) {
            bw.write(" ")
        }
        for (j in 0 until n - cnt) {
            bw.write(" ")
        }
        for (j in 0 until cnt) {
            bw.write("*")
        }
        if (cnt == n) isMax = true
        if (isMax) cnt--
        else cnt++
        bw.write("\n")
    }
    bw.flush()
    br.close()
}
