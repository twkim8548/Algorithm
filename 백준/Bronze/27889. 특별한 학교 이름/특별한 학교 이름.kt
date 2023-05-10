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

    when (br.readLine()) {
        "NLCS" -> {
            bw.write("North London Collegiate School")
        }

        "BHA" -> {
            bw.write("Branksome Hall Asia")
        }

        "KIS" -> {
            bw.write("Korea International School")
        }

        "SJA" -> {
            bw.write("St. Johnsbury Academy")
        }
    }
    bw.flush()
    bw.close()
}