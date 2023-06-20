import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val array = IntArray(3) { token.nextToken().toInt() }

        array.forEach {
            bw.write("$it ")
        }
        array.sort()
        bw.write("\n")
        if (array[0] >= 10 &&array[1] >= 10 && array[2] >= 10) {
            bw.write("triple-double")
        }  else if (array[1] >= 10 && array[2] >= 10) {
            bw.write("double-double")

        } else if (array[2] >= 10) {
            bw.write("double")
        } else {
            bw.write("zilch")
        }
        bw.write("\n\n")
    }

    bw.flush()
    bw.close()
}