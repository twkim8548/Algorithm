import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var first = 0
    var second = 0
    var third = 0
    repeat(n) {
        first += it + 1
    }

    bw.write("${first}\n${Math.pow(first.toDouble(), 2.0).toInt()}\n" +
            "${Math.pow(first.toDouble(), 2.0).toInt()}")

    bw.flush()
    bw.close()
}
