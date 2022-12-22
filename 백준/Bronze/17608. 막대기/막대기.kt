import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val array = IntArray(n){br.readLine().toInt()}

    array.reverse()

    var max = 0
    var cnt = 0
    array.forEach {
        if (max < it) {
            max = it
            cnt++
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
}
