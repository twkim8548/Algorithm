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
        val string = token.nextToken()
        val start = token.nextToken().toInt()
        val end = token.nextToken().toInt()

        bw.write("${string.substring(0, start)}${string.substring(end)}\n")
    }


    bw.flush()
    bw.close()
}