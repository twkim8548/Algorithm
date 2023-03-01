import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${(getMeasureSum(br.readLine().toInt()) * 5) - 24}")

    bw.flush()
    br.close()
}

fun getMeasureSum (n: Int) : Int {
    var sum = 0
    for (i in 1 .. n) {
        if (n % i == 0) {
            sum += i
        }
    }
    return sum
}
