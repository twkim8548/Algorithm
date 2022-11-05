import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 1
    while (true) {
        val string = br.readLine()
        if (string == "0") {
            break
        }

        bw.write("Case $cnt: Sorting... done!\n")
        cnt++
    }

    bw.flush()
    br.close()
}
