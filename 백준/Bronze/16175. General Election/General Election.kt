import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()
        val array = IntArray(n)
        repeat(m) {
            token = StringTokenizer(br.readLine())
            repeat(n) {
                array[it] += token.nextToken().toInt()
            }
        }
        bw.write("${array.indexOf(array.max()) + 1}\n")
    }

    bw.flush()
    bw.close()
}