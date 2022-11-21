import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val answer = intArrayOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val array = IntArray(10) {token.nextToken().toInt()}

        if (array.contentEquals(answer)) {
            bw.write("${it+1}\n")
        }
    }
    bw.flush()
    bw.close()
}