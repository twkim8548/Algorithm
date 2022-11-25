import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()

        if (a == 0 && b == 0 && c == 0) {
            break
        }

        if (b - a == c - b) {
            bw.write("AP ${c + (c - b)}\n")
        } else if (b / a == c / b) {
            bw.write("GP ${c * (c / b)}\n")
        }
    }

    bw.flush()
    bw.close()
}
