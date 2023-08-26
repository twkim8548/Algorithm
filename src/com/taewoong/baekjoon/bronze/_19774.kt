import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate
import java.util.Date
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val num = br.readLine()
        val a = num.substring(0, 2).toDouble()
        val b = num.substring(2).toDouble()

        if ((a.pow(2).toInt() + b.pow(2).toInt()) % 7 == 1) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }


    bw.flush()
    bw.close()
}
