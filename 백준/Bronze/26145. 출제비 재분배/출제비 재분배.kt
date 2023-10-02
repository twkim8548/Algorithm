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
    val m = token.nextToken().toInt()

    val array = IntArray(n + m)

    token = StringTokenizer(br.readLine())
    repeat(n) {
        array[it] = token.nextToken().toInt()
    }

    repeat(n) { i ->
        token = StringTokenizer(br.readLine())
        repeat(n + m) { j ->
            val num = token.nextToken().toInt()
            array[i] -= num
            array[j] += num
        }
    }

    array.forEach {
        bw.write("$it ")
    }

    bw.flush()
    br.close()
}