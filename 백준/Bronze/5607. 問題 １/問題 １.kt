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

    var aCnt = 0
    var bCnt = 0

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()


        if (a > b) {
            aCnt += a + b
        } else if (a < b) {
            bCnt += a + b
        } else {
            aCnt += a
            bCnt += b
        }

    }
        bw.write("$aCnt $bCnt\n")

    bw.flush()
    bw.close()
}
