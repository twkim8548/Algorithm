import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val string = br.readLine()

        if (string.lowercase() == string.reversed().lowercase()) {
            bw.write("Yes\n")
        } else {
            bw.write("No\n")
        }
    }

    bw.flush()
    bw.close()
}
