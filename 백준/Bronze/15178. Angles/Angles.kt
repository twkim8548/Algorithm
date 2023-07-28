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
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()
        if (a + b + c == 180) {
            bw.write("$a $b $c Seems OK\n")
        } else {
            bw.write("$a $b $c Check\n")
        }
    }

    bw.flush()
    bw.close()
}
