import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val day = br.readLine().toInt()
    val money = br.readLine().toInt()
    val answer = mutableListOf<Int>()

    if (day >= 20) {
        answer.add((money * 0.75).toInt())
    }
    if (day >= 15) {
        answer.add(money - 2000)
    }
    if (day >= 10) {
        answer.add((money * 0.9).toInt())
    }
    if (day >= 5) {
        answer.add(money - 500)
    }
    answer.add(money)

    bw.write("${if(answer.min() < 0) "0" else answer.min()}")

    bw.flush()
    bw.close()
}