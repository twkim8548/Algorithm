import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val money = token.nextToken().toInt()

    val array = IntArray(n) { br.readLine().toInt() }

    array.forEach {
        bw.write("${money / array.sum() * it}\n")
    }

    bw.flush()
    bw.close()
}