import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    val array = IntArray(n) { token.nextToken().toInt() }
    var sum = array[0]
    var first = 0

    for (i in 0 until n - 1) {
        if (array[i + 1] - array[i] > 1) {
            sum += first
            first = array[i+1]
        }
    }
    sum += first

    bw.write("$sum")

    bw.flush()
    bw.close()
}
