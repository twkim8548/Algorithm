import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()

    if (x >= y) bw.write("${x+y}")
    else bw.write("${y-x}")

    bw.flush()
    bw.close()
}