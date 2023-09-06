import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val n = br.readLine().toInt()

    var token = StringTokenizer(br.readLine())
    var sum = 0.0

    repeat(n) {
        sum += Math.pow(token.nextToken().toDouble(), 3.0)
    }
    bw.write("${Math.cbrt(sum)}")


    bw.flush()
    bw.close()
}