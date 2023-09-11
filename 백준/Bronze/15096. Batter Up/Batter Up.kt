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

    var cnt = 0.0
    var sum = 0.0

    repeat(n) {
        val num = token.nextToken().toInt()

        if (num > -1) {
            cnt ++
            sum += num
        }
    }

    bw.write("${sum/cnt}")

    bw.flush()
    bw.close()
}