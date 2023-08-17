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
        val str = br.readLine()
        if (str == null || str == "") {
            break
        }
        val token = StringTokenizer(str)
        val h = token.nextToken().toDouble()
        val p = token.nextToken().toDouble()

        bw.write("${String.format("%.2f",h / p)}\n")
    }



    bw.flush()
    bw.close()
}