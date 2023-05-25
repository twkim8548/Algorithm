import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val emoji = br.readLine()

    var answer = emoji.length
    emoji.forEach {
        if (it == '_') {
            answer += 5
        } else if (it  == ':') {
            answer += 1
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}