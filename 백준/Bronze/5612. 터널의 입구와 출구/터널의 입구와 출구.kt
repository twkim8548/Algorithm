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

    val n = br.readLine().toInt()
    var m = br.readLine().toInt()
    var isZero = false
    var max = m
    repeat(n) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val cnt = m + a - b
        if (cnt < 0) {
            isZero = true
        }
        if (cnt > max) {
            max = cnt
        }
        m = cnt
    }
    if (isZero) {
        bw.write("0")
    } else {
        bw.write("$max")
    }

    bw.flush()
    bw.close()
}
