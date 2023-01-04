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
    val array = mutableListOf<Int>()
    repeat(n) {
        val num = br.readLine().toInt()

        if (num != 0) {
            array.add(num)
        } else {
            array.removeLast()
        }
    }

    bw.write("${array.sum()}")

    bw.flush()
    bw.close()
}
