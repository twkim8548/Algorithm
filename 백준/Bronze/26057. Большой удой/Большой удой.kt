import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val l = br.readLine().toInt()
    val t = br.readLine().toInt()

    bw.write("${t - (l - t)}")

    bw.flush()
    br.close()
}
