import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var token = StringTokenizer(br.readLine())
    val think = IntArray(n) {token.nextToken().toInt()}
    token = StringTokenizer(br.readLine())
    val real = IntArray(n) {token.nextToken().toInt()}

    var answer = 0

    think.forEachIndexed { index, i ->
        if (i <= real[index]) {
            answer++
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}
