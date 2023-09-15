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

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        var sum = 0.0
        repeat(n) {
            val token = StringTokenizer(br.readLine())
            val name = token.nextToken()

            sum += token.nextToken().toDouble() * token.nextToken().toDouble()
        }
        bw.write("$${String.format("%.2f", sum)}\n")
    }


    bw.flush()
    br.close()
}