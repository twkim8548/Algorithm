import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toDouble()

    val commission = k / 100 + 25
    if (commission < 100) {
        bw.write(String.format("%.2f", 100.0))
    } else if (commission > 2000) {
        bw.write(String.format("%.2f", 2000.0))
    } else {
        bw.write(String.format("%.2f", commission))
    }

    bw.flush()
    bw.close()
}