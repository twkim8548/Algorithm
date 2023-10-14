import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    if (a >= 1000) {
        if (b >= 8000 || c >= 260) {
            bw.write("Very Good")
        } else {
            bw.write("Good")
        }
    } else {
        bw.write("Bad")
    }

    bw.flush()
    bw.close()
}
