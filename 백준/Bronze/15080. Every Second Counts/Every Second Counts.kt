import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val start = br.readLine().split(" : ")
    val h1 = start[0].toInt()
    val m1 = start[1].toInt()
    val s1 = start[2].toInt()
    val t1 = h1 * 3600 + m1 * 60 + s1
    val end = br.readLine().split(" : ")
    val h2 = end[0].toInt()
    val m2 = end[1].toInt()
    val s2 = end[2].toInt()
    val t2 = h2 * 3600 + m2 * 60 + s2

    if (t1 > t2) {
        bw.write("${t2 - t1 + 3600 * 24}")
    } else {
        bw.write("${t2 - t1}")
    }

    bw.flush()
    bw.close()
}
