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
        val n = br.readLine().toInt() + 1
        repeat(n) {
            val token = StringTokenizer(br.readLine())
        }
        bw.write("Material Management ${it + 1}\n")
        bw.write("Classification ---- End!\n")
    }

    bw.flush()
    bw.close()
}