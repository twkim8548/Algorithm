import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    var a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val n = token.nextToken().toInt()

    a %= b

    repeat(n-1) {
        a = (a * 10) % b
    }

    bw.write("${(a * 10) / b}")
    bw.flush()
    bw.close()

    br.close()
}