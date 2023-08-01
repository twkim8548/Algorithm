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
        val n = token.nextToken().toInt()

        val array = IntArray(n) { token.nextToken().toInt() }

        var cnt = 1
        for (i in 1 until n) {
            cnt++
            if(array[i] - 1 != array[i-1]) {
                bw.write("$cnt\n")
                break
            }
        }
    }

    bw.flush()
    bw.close()
}
