import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val str = br.readLine()

    val map  = mutableMapOf<Char, Int>()
    str.forEach {
        if (map[it] == null) {
            map[it] = 1
        } else {
            map[it] = map[it]!! + 1
        }
    }

    val max = map.toList().sortedByDescending { it.second }[0]
    bw.write("${max.first} ${max.second}")

    bw.flush()
    br.close()
}