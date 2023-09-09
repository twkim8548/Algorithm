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

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    repeat(n) {
        bw.write("${getPreviousLevel(token.nextToken().toInt())} ")
    }
    bw.flush()
    bw.close()
}

fun getPreviousLevel(level: Int) : Int {
    return if (level>= 300) {
        1
    } else if (level >= 275) {
        2
    } else if (level >= 250) {
        3
    } else {
        4
    }
}