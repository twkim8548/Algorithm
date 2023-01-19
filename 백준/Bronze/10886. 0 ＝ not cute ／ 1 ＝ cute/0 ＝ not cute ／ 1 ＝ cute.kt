import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var isCute = 0
    val n = br.readLine().toInt()
    repeat(n) {
        isCute  += br.readLine().toInt()
    }

    if (isCute > n/2) {
        bw.write("Junhee is cute!")
    } else {
        bw.write("Junhee is not cute!")
    }

    bw.flush()
    bw.close()
}
