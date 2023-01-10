import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val map = mutableMapOf<Char,Int>()

    n.forEach {
        if (map[it] != null) {
            map[it] = map[it]!! + 1
        } else {
            map[it] = 1
        }
    }

    var isTwo = false
    map.forEach { t, u ->
        if (u > 1) {
            isTwo = true
        }
    }

    if (isTwo) {
        bw.write("0")
    } else {
        bw.write("1")
    }

    bw.flush()
    bw.close()
}
