import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())


    val array = IntArray(3) {token.nextToken().toInt()}

    bw.write("${(array.max() - array[0] )+ (array.max() - array[1]) + (array.max() - array[2] )}")



    bw.flush()
    bw.close()
}