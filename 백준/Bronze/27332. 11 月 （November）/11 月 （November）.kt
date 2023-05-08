import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate
import java.util.Date
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val date = LocalDate.of(2022, 11, br.readLine().toInt())

    if (date.plusWeeks(br.readLine().toLong()).monthValue == 11) {
        bw.write("1")
    } else {
        bw.write("0")
    }


    bw.flush()
    bw.close()
}