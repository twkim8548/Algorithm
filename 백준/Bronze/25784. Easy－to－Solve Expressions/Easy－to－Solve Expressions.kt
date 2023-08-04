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

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    if (a + b == c || a + c == b || b + c == a) {
        bw.write("1")
    } else if (a * b == c || a * c == b || b * c == a) {
        bw.write("2")
    } else {
        bw.write("3")
    }

    bw.flush()
    bw.close()
}
