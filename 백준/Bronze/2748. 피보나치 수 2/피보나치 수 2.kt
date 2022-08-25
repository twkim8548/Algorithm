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
    var prevN = BigInteger.ONE
    var nextN = BigInteger.ZERO

    for (i in 0 until n) {
        val tempPrevN = nextN
        nextN = tempPrevN + prevN
        prevN = tempPrevN
    }

    bw.write("$nextN")

    bw.flush()
    bw.close()

    br.close()
}
