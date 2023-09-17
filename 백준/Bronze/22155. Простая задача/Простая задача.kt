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

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val ifNum = token.nextToken().toInt()
        val forNum = token.nextToken().toInt()

        if ((ifNum <= 1 && forNum <= 2) || (ifNum <= 2 && forNum <= 1)) {
            bw.write("Yes\n")
        } else {
            bw.write("No\n")
        }
    }


    bw.flush()
    bw.close()
}