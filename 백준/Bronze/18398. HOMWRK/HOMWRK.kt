import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        repeat(br.readLine().toInt()) {
            val token = StringTokenizer(br.readLine())

            val a = token.nextToken().toInt()
            val b = token.nextToken().toInt()

            bw.write("${a + b} ${a * b}\n")
        }
    }

    bw.flush()
    bw.close()
}