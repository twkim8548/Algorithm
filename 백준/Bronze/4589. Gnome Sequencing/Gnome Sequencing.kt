import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write("Gnomes:\n")
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()

        if ((a > b && b > c) || (a < b && b < c)) {
            bw.write("Ordered\n")
        } else {
            bw.write("Unordered\n")
        }
    }

    bw.flush()
    br.close()
}