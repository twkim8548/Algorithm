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

    val map = mutableMapOf<Int, Int>()

    repeat(n) {
        val num = br.readLine().toInt()
        if (map[num] != null) {
            map[num] = map[num]!! + 1
        } else {
            map[num] = 1
        }
    }

    bw.write("${map.toList().sortedByDescending { it.second }[0].second}")

    bw.flush()
    bw.close()
}
