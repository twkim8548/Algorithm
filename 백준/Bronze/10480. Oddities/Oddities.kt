import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        if (n % 2 == 0) {
            bw.write("$n is even\n")
        } else {
            bw.write("$n is odd\n")
        }
    }

    bw.flush()
    bw.close()
}