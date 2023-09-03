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
        var sum = 0
        val n = br.readLine().toInt()
        for (i in 1 .. n) {
            sum += i * t(i + 1)
        }
        bw.write("$sum\n")
    }

    bw.flush()
    br.close()
}

fun t(n: Int): Int{
    var sum = 0
    repeat(n) {
        sum += it + 1
    }
    return sum
}