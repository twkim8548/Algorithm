import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val s = token.nextToken().toInt()
    token =  StringTokenizer(br.readLine())
    val array = IntArray(n) {token.nextToken().toInt()}

    bw.write("${Math.ceil(array.max() * s / 1000.0).toInt()}")

    bw.flush()
    bw.close()
}
