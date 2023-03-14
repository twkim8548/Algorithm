import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    var cnt = 1
    var isWrong = false
    repeat(n) {
        val text = token.nextToken()
        if (text != cnt.toString() && text != "mumble") {
            isWrong = true
        }
        cnt++
    }

    if (isWrong) {
        bw.write("something is fishy")
    } else {
        bw.write("makes sense")
    }

    bw.flush()
    bw.close()
}