import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    if (n > 228) {
        bw.write("4")
    } else if (n > 217) {
        bw.write("3")
    } else if (n > 205) {
        bw.write("2")
    } else {
        bw.write("1")
    }

    bw.flush()
    bw.close()
}