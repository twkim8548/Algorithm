import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var token = StringTokenizer(br.readLine())
        val m = token.nextToken().toInt()
        val type = token.nextToken()

        token = StringTokenizer(br.readLine())

        repeat(m) {
            if (type == "C") {
                bw.write("${token.nextToken()[0].code - 64} ")
            } else {
                bw.write("${(token.nextToken().toInt() + 64).toChar()} ")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}