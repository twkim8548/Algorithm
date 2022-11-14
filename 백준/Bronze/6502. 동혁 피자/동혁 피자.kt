import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var i = 1
    while (true) {
        val s = br.readLine()
        if (s == "0") {
            break
        }
        val token = StringTokenizer(s)

        val r = token.nextToken().toInt()
        val w = token.nextToken().toInt()
        val l = token.nextToken().toInt()

        if (4 * (r * r) >= (w * w) + (l * l)) {
            bw.write("Pizza $i fits on the table.\n")
        } else {
            bw.write("Pizza $i does not fit on the table.\n")
        }

        i++

    }

    bw.flush()
    bw.close()
}
