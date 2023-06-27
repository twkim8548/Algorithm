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
    val array = IntArray(n)
    repeat(n) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()

        array[it] = a * (b + c)
        if (a == (b+c)) {
            array[it] += a * (b + c)
        }
    }

    array.sortDescending()
    bw.write("${array[0]}")


    bw.flush()
    bw.close()
}