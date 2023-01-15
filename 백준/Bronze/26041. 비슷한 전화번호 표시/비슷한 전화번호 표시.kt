import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = br.readLine()
    val number = br.readLine()
    var answer = 0

    token.split(" ").forEach {
        if (it != number && it.startsWith(number)) {
            answer++
        }
    }

    bw.write("$answer")

    bw.flush()
    br.close()
}
