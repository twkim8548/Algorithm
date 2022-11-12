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
        val a = token.nextToken()
        val b = token.nextToken()

        bw.write("Distances: ")
        a.forEachIndexed { index, c ->
            if (b[index].code >= c.code) {
                bw.write("${b[index].code  - c.code} ")
            } else {

                bw.write("${b[index].code + 26  - c.code} ")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    br.close()
}