import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val r = token.nextToken().toInt()
        val e = token.nextToken().toInt()
        val c = token.nextToken().toInt()

        if (r == e-c) {
            bw.write("does not matter\n")
        } else if (r > e-c) {
            bw.write("do not advertise\n")
        } else {
            bw.write("advertise\n")
        }
    }
    bw.flush()
    bw.close()
}
