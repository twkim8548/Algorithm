import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val z = token.nextToken()
    val b = token.nextToken().toInt()
    val y = token.nextToken()
    val c = token.nextToken().toInt()
    if (a + b == c) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    br.close()
}
