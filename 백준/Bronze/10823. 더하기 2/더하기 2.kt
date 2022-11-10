import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var answer = 0
    var string = ""
    while (true) {
        val s = br.readLine()
        if (s == "" || s == null) break
        string += s
    }

    string.split(",").forEach {
        if (it != "")
            answer += it.toInt()
    }
    bw.write("$answer")

    bw.flush()
    br.close()
}
