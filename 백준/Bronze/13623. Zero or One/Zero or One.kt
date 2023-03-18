import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    if (a == b && a != c) {
        bw.write("C")
    } else if (a == c && a != b) {
        bw.write("B")
    } else if (b == c && a != b) {
        bw.write("A")
    } else {
        bw.write("*")
    }

    bw.flush()
    br.close()
}
