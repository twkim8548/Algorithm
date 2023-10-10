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

    val str = br.readLine()

    if (str.contains('7') && str.toInt() % 7 == 0) {
        bw.write("3")
    } else if (str.contains('7') && str.toInt() % 7 > 0) {
        bw.write("2")
    } else if (!str.contains('7') && str.toInt() % 7 == 0) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()
}
