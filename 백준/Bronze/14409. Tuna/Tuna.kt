import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val x = br.readLine().toInt()
    var answer = 0

    repeat(n) {
        val token = StringTokenizer(br.readLine())

        val p1 = token.nextToken().toInt()
        val p2 = token.nextToken().toInt()

        answer += if (abs( p2-p1) <= x) {
            max(p2,p1)
        } else {
            br.readLine().toInt()
        }
    }

    bw.write("$answer")

    bw.flush()
    br.close()
}
