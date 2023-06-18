import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val str = br.readLine()
    val token = StringTokenizer(str)
    var cnt = 0

    var answer = 0
    while (true) {
        val word = token.nextToken()
        if (word.first().isUpperCase() && word.none { it !in 'A'..'Z' && it !in 'a'..'z' && !arrayOf('.', '?', '!').contains(it) }) {
            answer++
        }
        if (word.last() == '.' || word.last() == '?' || word.last() == '!') {
            bw.write("$answer\n")
            answer = 0
            cnt++
            if (cnt == n) {
                break
            }
        }
    }

    bw.flush()
    bw.close()
}