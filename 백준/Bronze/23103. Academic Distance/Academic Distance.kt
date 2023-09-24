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

    var sum = 0
    var a = 0
    var b = 0
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val c = token.nextToken().toInt()
        val d = token.nextToken().toInt()
        if (it > 0) {
            sum += Math.abs(a - c) + Math.abs(b - d)
        }
            a = c
            b = d
    }

    bw.write("$sum")

    bw.flush()
    br.close()
}