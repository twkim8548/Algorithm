import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val car = br.readLine().toInt()

    if (car - n <= 0) {
        bw.write("Congratulations, you are within the speed limit!")
    } else if (car - n <= 20) {
        bw.write("You are speeding and your fine is \$100.")
    } else if (car - n <= 30) {
        bw.write("You are speeding and your fine is \$270.")
    } else {
        bw.write("You are speeding and your fine is \$500.")
    }

    bw.flush()
    bw.close()
}