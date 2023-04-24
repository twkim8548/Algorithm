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
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    var num = 0

    repeat(n) {
        repeat(m) { col ->
            num++
            if (m - 1 == col) {
                bw.write("$num")
            } else {
                bw.write("$num ")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}
