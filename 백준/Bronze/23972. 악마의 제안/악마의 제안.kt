import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val k = token.nextToken().toInt()
    val n = token.nextToken().toInt()
    if (n == 1) {
        bw.write("-1")
    } else {
        val div: Long = 1L * k * n / (n - 1)
        val mod: Long = 1L * k * n % (n - 1)
        bw.write("${div + if (mod > 0) 1 else 0}")
    }

    bw.flush()
    bw.close()
}
