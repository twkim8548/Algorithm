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
    val t1 = token.nextToken().toInt()
    val m1 = token.nextToken().toInt()
    val t2 = token.nextToken().toInt()
    val m2 = token.nextToken().toInt()

    val dateFormat = SimpleDateFormat("HH:mm")
    val start = dateFormat.parse("$t1:$m1")
    val end = dateFormat.parse("$t2:$m2")

    if (t1 > t2 || (t1 == t2 && m1 > m2)) {
        end.date += 1
    }

    val diff: Long = end.time - start.time
    val seconds = diff / 1000
    val minutes = seconds / 60
    val hours = minutes / 60
    val days = hours / 24

    bw.write("$minutes\n${minutes/30}")

    bw.flush()
    bw.close()
}