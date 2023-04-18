import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val array = IntArray(10) {token.nextToken().toInt()}

        bw.write("${array.joinToString(" ")}\n")

        if (array.contains(17) && array.contains(18)) {
            bw.write("both\n")
        } else if (array.contains(17)) {
            bw.write("zack\n")
        } else if (array.contains(18)) {
            bw.write("mack\n")
        } else {
            bw.write("none\n")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}