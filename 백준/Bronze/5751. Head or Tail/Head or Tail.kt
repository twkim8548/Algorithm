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

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) {
            break
        }

        val token = StringTokenizer(br.readLine())
        val array = IntArray(n) { token.nextToken().toInt() }

        bw.write("Mary won ${array.count { it == 0 }} times and John won ${array.count{ it == 1 }} times\n")
    }


    bw.flush()
    bw.close()
}