import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val d = token.nextToken().toInt()
    if (a * b == c * d) {
        bw.write("E")
    } else if (a * b > c * d) {
        bw.write("M")
    } else {
        bw.write("P")
    }


    bw.flush()
    bw.close()
}