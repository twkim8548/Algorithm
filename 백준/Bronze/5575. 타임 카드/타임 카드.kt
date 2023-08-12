import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(3) {
        val token = StringTokenizer(br.readLine())

        val h1 = token.nextToken().toInt()
        val m1 = token.nextToken().toInt()
        val s1 = token.nextToken().toInt()
        val h2 = token.nextToken().toInt()
        val m2 = token.nextToken().toInt()
        val s2 = token.nextToken().toInt()

        val t1: Int = h1 * 60 * 60 + m1 * 60 + s1
        val t2: Int = h2 * 60 * 60 + m2 * 60 + s2

        val t = t2 - t1

        val h = t / 60 / 60 % 24
        val m = t / 60 % 60
        val s = t % 60

        bw.write("$h $m $s\n")
    }
    bw.flush()
    bw.close()
}
