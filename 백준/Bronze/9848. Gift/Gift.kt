import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    val array = IntArray(n) { br.readLine().toInt() }

    var answer = 0
    for (i in 1 until n) {
        if (array[i-1] - array[i] >= k) {
            answer++
        }
    }

    bw.write("$answer")

    bw.flush()
    br.close()
}
