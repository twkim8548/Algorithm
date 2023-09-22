import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var res = 1
    for (i in 11 ..n) {
        res *= i
    }
    bw.write("${6 * res}")


    bw.flush()
    bw.close()
}