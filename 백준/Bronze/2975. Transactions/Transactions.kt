import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken()
        val c = token.nextToken().toInt()
        if (a == 0 && b == "W" && c == 0) break

        if (b == "W") {
            if (a - c < -200) {
                bw.write("Not allowed\n")
            } else {
                bw.write("${a-c}\n")
            }
        } else {
            bw.write("${a + c}\n")
        }
    }

    bw.flush()
    br.close()
}
