import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {

        val token = StringTokenizer(br.readLine())

        val call = token.nextToken().toInt()
        val data = token.nextToken().toInt()
        if (call == 0 && data == 0) {
            break
        }

        val parsTel = call * 30 + data * 40
        val parsCell = call * 40 + data * 20
        val parsPhone = call * 35 + data * 30

        val array = intArrayOf(parsTel, parsCell, parsPhone)
        bw.write("${array.min()}\n")
    }

    bw.flush()
    bw.close()
}
