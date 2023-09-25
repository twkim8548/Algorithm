import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        var a = token.nextToken().toInt()
        var b = token.nextToken().toInt()
        val c = token.nextToken().toInt()
        val originA = a
        val originB = b

        repeat(c) {
            if (a > b) {
                a /= 2
            } else {
                b /= 2
            }
        }
        if (a > b) {
            bw.write("Data set: $originA $originB $c\n$a $b\n\n")
        } else {
            bw.write("Data set: $originA $originB $c\n$b $a\n\n")
        }
    }


    bw.flush()
    bw.close()
}
