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

    val token = StringTokenizer(br.readLine())

    val k = token.nextToken().toInt()
    val w = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    bw.write("${if ((w - k) % m == 0) ((w - k) / m ) else ((w - k) / m ) + 1}")


    bw.flush()
    bw.close()
}