import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    var k = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val array = IntArray(n) { token.nextToken().toInt() }

    var cnt = 0
    while (array[cnt] >= k) {
        cnt++
        k++
        if (cnt > array.size - 1) {
            cnt = 0
        }
    }
    bw.write("${cnt + 1}")


    bw.flush()
    br.close()
}
