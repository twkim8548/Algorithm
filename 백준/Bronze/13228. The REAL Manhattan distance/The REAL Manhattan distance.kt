import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val x1 = token.nextToken().toInt()
        val y1 = token.nextToken().toInt()
        val floor1 = token.nextToken().toInt()
        val x2 = token.nextToken().toInt()
        val y2 = token.nextToken().toInt()
        val floor2 = token.nextToken().toInt()

        bw.write("${abs(x1 - x2) + abs(y2 - y1) + floor1 + floor2}\n")
    }

    bw.flush()
    bw.close()
}
