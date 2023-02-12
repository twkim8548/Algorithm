import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()

    var answer = 0
    answer += min(abs(a - b), min(abs(a - x) + abs(b - y), abs(a - y) + abs(b - x)))

    bw.write("$answer")
    bw.flush()
    br.close()
}
