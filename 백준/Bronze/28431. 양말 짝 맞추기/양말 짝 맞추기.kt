import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<Int, Boolean>()
    repeat(5) {
        val n = br.readLine().toInt()
        if (map[n] == null) {
            map[n] = false
        } else {
            map[n] = map[n] == false

        }


    }
    bw.write("${map.toList().find { !it.second }?.first}")

    bw.flush()
    br.close()
}
