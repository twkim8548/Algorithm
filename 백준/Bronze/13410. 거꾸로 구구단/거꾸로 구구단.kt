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

    val array = IntArray(k)

    repeat(k) {
        array[it] = ((it + 1) * n).toString().reversed().toInt()
    }

    bw.write("${array.maxOrNull()}")

    bw.flush()
    bw.close()
}
