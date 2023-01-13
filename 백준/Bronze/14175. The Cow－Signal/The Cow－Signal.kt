import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val m = token.nextToken().toInt()
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    repeat(m) {
        val string = br.readLine()
        repeat(k) {
            string.forEach { c ->
                repeat(k) {
                    bw.write("$c")
                }
            }
            bw.write("\n")
        }
    }

    bw.flush()
    bw.close()
}
