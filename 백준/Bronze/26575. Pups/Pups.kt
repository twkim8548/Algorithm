import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        bw.write("$${String.format("%.2f", (token.nextToken().toDouble() * token.nextToken().toDouble() * token.nextToken().toDouble()))}\n")
    }

    bw.flush()
    br.close()
}
