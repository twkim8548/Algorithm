import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.Writer
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val p = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())

    val array = Array(n) { Array(k) { 0 } }

    repeat(n) { i ->
        repeat(k) { j ->
            array[i][j] = token.nextToken().toInt()
        }
    }

    var answer = 0
    array.forEach {
        var sum = 0
        sum += it.count { it == 0 }
        if (sum < p) {
            answer += 1
        }
    }
    bw.write("$answer")

    bw.flush()
    br.close()
}