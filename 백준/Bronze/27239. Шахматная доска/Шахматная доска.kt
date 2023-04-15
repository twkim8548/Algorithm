import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val chars = arrayOf("h", "a", "b", "c", "d", "e", "f", "g")


    bw.write("${chars[(n % 8)]}")
    bw.write("${if (n % 8 == 0) (n / 8) else (n / 8) + 1}")

    bw.flush()
    br.close()
}
