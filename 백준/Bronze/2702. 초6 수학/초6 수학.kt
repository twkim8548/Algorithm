import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate.now
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        if (a > b) {
            bw.write("${a * b / gcd(a, b)} ")
            bw.write("${gcd(a, b)}\n")
        } else {
            bw.write("${a * b / gcd(b, a)} ")
            bw.write("${gcd(b, a)}\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    else return gcd(b, a % b)
}