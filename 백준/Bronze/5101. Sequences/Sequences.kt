import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())
        val x = token.nextToken().toInt()
        val y = token.nextToken().toInt()
        val z = token.nextToken().toInt()

        if (x == 0 && y == 0 && z == 0) {
            break
        }

        if (z >= x && (z - x) % y == 0) {
            bw.write("${(z - x) / y + 1}\n")
        } else {
            bw.write("X\n")
        }
    }
    bw.flush()
    bw.close()
}