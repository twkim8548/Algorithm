import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val array = IntArray(3) {token.nextToken().toInt()}
    array.sort()

    if (array[0] == array[1] && array[1] == array[2]) {
        bw.write("2")
    } else if ((array[0].toDouble().pow(2) + array[1].toDouble().pow(2)) == array[2].toDouble().pow(2)) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.flush()
    br.close()
}
