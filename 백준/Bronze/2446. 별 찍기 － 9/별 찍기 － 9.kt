import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var cnt = 0
    var isMax = false
    for (i in 0 until 2 * n - 1) {
        for (j in 0 until cnt) {
            bw.write(" ")
        }
        for (j in 0 until 2 * n - 1 - (cnt * 2)) {
            bw.write("*")
        }
        bw.write("\n")
        if (cnt == n - 1) {
            isMax = true
        }
        if (isMax) {
            cnt--
        } else {
            cnt++
        }
    }
    bw.flush()
    br.close()
}
