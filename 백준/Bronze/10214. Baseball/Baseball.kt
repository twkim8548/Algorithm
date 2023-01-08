import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var totalY = 0
        var totalK = 0
        repeat(9) {
            val token = StringTokenizer(br.readLine())

            val y = token.nextToken().toInt()
            val k = token.nextToken().toInt()

            totalY += y
            totalK += k
        }
        if (totalY > totalK) {
            bw.write("Yonsei\n")
        } else if (totalK > totalY) {
            bw.write("Korea\n")
        } else {
            bw.write("Draw\n")
        }
    }

    bw.flush()
    br.close()
}
