import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    val array = IntArray(n) { token.nextToken().toInt() }

    var player = 0
    var par = 0
    array.forEachIndexed { index, i ->
        if ((index + 1) % 2 == 0) {
            par += 3
        } else {
            par += 2
        }
        player += if (i > 7) {
            7
        } else {
            i
        }
    }

    bw.write("${player - par}")


    bw.flush()
    bw.close()
}