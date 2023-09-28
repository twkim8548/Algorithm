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

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    if (a > 1 && b > 1) {
        bw.write("${a * 2 + b * 2 - 4}")
    } else {
        bw.write("${a + b - 1}")
    }

    bw.flush()
    br.close()
}