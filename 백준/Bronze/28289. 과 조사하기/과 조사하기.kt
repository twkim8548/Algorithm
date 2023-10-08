import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val answer = IntArray(4)

    repeat(br.readLine().toInt()) {
        val string = StringTokenizer(br.readLine())
        val a = string.nextToken().toInt()
        val b = string.nextToken().toInt()
        val c = string.nextToken().toInt()

        if (a >= 2) {
            if (b == 1 || b == 2) {
                answer[0]++
            } else if (b == 3) {
                answer[1]++
            } else if (b == 4) {
                answer[2]++
            } else {
                answer[3]++
            }
        } else {
            answer[3]++
        }
    }
    answer.forEach {
        bw.write("$it\n")
    }
    bw.flush()
    br.close()
}
