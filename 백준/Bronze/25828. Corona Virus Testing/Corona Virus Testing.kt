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
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    val x = a + (b * c)
    val y = a * b

    if (x > y) {
        bw.write("1")
    } else if (x < y) {
        bw.write("2")
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()
}