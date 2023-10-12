import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    var x0 = token.nextToken().toInt()
    val n = token.nextToken().toInt()

    repeat(n) {
        x0 = if (x0 % 2 == 0)
            (x0/2) xor 6
        else
            (2 * x0) xor 6
    }
    bw.write("$x0")

    bw.flush()
    bw.close()
}
