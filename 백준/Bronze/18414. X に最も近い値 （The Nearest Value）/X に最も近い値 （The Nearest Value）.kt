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

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    if (a in b..c) {
        bw.write("$a")
    } else {
        if (abs(a - b) > abs(a - c)) {
            bw.write("$c")
        } else {
            bw.write("$b")
        }
    }
    bw.flush()
    br.close()
}
