import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val x = token.nextToken().toInt()
        val y = token.nextToken().toInt()

        if (x >= y) {
            bw.write("MMM BRAINS\n")
        } else {
            bw.write("NO BRAINS\n")
        }
    }
    bw.flush()
    bw.close()
}
