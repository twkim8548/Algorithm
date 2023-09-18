import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    repeat(n) {
        val str = br.readLine()
        str.forEach {
            if (k == 1) {
                when(it) {
                    'd' -> bw.write("q")
                    'b' -> bw.write("p")
                    'q' -> bw.write("d")
                    'p' -> bw.write("b")
                }
            } else {
                when(it) {
                    'd' -> bw.write("b")
                    'b' -> bw.write("d")
                    'q' -> bw.write("p")
                    'p' -> bw.write("q")
                }
            }
        }
        bw.write("\n")
    }


    bw.flush()
    bw.close()
}