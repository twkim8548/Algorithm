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
    val array = IntArray(n) {token.nextToken().toInt()}
    val answerArray = IntArray(n)

    array.forEachIndexed { index, i ->
        answerArray[index] = i - (n - index)
    }

    bw.write("${answerArray.max()}")


    bw.flush()
    bw.close()
}
