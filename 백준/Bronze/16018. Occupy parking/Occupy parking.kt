import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val yesterday = br.readLine().split("")
    val today = br.readLine().split("")

    var answer = 0
    for (i in 0 .. n) {
        if (yesterday[i] == "C" && today[i] == "C") {
            answer++
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
