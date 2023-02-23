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

    val token = StringTokenizer(br.readLine())
    val array = IntArray(3){token.nextToken().toInt()}.sorted()

    bw.write("${array[0] + array[1] + min(array[2], array[0] + array[1] - 1)}")

    bw.flush()
    bw.close()
}