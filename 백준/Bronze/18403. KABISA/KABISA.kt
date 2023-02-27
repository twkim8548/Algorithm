import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val array = br.readLine().split(", ")
        array.forEach {
            if (it.toInt() % 4 == 0) {
                bw.write("$it ")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}