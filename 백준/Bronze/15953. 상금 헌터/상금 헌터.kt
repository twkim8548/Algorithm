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

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        var answer = 0

        if (a > 0) {
            if (a == 1) {
                answer += 5000000
            } else if (a <= 3) {
                answer += 3000000
            } else if (a <= 6) {
                answer += 2000000
            } else if (a <= 10) {
                answer += 500000
            } else if (a <= 15) {
                answer += 300000
            } else if (a <= 21) {
                answer += 100000
            }
        }

        if (b > 0) {
            if (b == 1) {
                answer += 5120000
            } else if (b <= 3) {
                answer += 2560000
            } else if (b <= 7) {
                answer += 1280000
            } else if (b <= 15) {
                answer += 640000
            } else if (b <= 31) {
                answer += 320000
            }
        }
        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()
}