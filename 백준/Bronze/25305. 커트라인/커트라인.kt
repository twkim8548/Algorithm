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
    val k = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())

    val array = IntArray(n) { token.nextToken().toInt() }

    bw.write("${array.sortedDescending()[k-1]}")

    bw.flush()

    br.close()
}
