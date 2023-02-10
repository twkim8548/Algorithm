import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val t = token.nextToken().toInt()
    val s = token.nextToken().toInt()

    if ((t in 12..16) && s == 0) {
        bw.write("320")
    } else {
        bw.write("280")
    }

    bw.flush()
    br.close()
}
