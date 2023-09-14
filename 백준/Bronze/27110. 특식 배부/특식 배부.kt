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

    val token = StringTokenizer(br.readLine())

    var sum = 0
    repeat(3) {
        val num = token.nextToken().toInt()
        if (num < n) {
            sum += num
        } else {
            sum += n
        }
    }

    bw.write("$sum")


    bw.flush()
    bw.close()
}