import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val z = br.readLine()

    bw.write("${z.count { it == 'A' }} : ${z.count { it == 'B' }}")

    bw.flush()
    bw.close()
}