import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    val array = IntArray(n) { token.nextToken().toInt() }

    var answer = 0
    array.forEachIndexed { index, i ->
        if (index + 1 != i) {
            answer ++
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
