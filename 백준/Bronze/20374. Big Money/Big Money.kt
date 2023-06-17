import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = "0.0".toBigDecimal()

    while(true) {
        val money = br.readLine()
        if (money == null || money.isEmpty()) {
            break
        }
        answer += money.toBigDecimal()
    }

    bw.write(String.format("%.2f", answer))
    bw.flush()
    bw.close()
}