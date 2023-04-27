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

    var x = 0
    var y = 0
    val n = br.readLine().toInt()
    for (i in 0 until n) {
        if (br.readLine() == "D") {
            x++
        } else {
            y++
        }
        if (abs(x - y) >= 2) {
            break
        }
    }


    bw.write("$x:$y")

    bw.flush()
    bw.close()
}