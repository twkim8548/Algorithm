import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toDouble()
        val b = token.nextToken().toDouble()

        bw.write("The height of the triangle is ${String.format("%.2f", (2.0 * a / b))} units\n")
    }

    bw.flush()
    bw.close()
}