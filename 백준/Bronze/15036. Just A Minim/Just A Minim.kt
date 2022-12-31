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

    val token = StringTokenizer(br.readLine())
    val array = IntArray(n) {token.nextToken().toInt()}

    var answer = 0.0

    array.forEach {
        when (it) {
            0 -> {
                answer += 2.0
            }
            1 -> {
                answer += 1.0
            }
            2 -> {
                answer += 0.5
            }
            4 -> {
                answer += 0.25
            }
            8 -> {
                answer += 0.125
            }
            16 -> {
                answer += 0.0625
            }
        }
    }

    bw.write("$answer")

    bw.flush()
    br.close()
}
