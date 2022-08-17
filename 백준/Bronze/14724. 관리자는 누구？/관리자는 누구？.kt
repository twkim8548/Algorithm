import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val nameArray = arrayOf("PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY")
    val array = arrayOf(
        IntArray(n),
        IntArray(n),
        IntArray(n),
        IntArray(n),
        IntArray(n),
        IntArray(n),
        IntArray(n),
        IntArray(n),
        IntArray(n)
    )
    repeat(9) { name ->
        val token = StringTokenizer(br.readLine())
        repeat(n) {
            array[name][it] = token.nextToken().toInt()
        }
    }

    var max = 0
    var nameIndex = 0
    array.forEachIndexed { index, ints ->
        if (ints.maxOrNull()!! > max) {
            max = ints.maxOrNull()!!
            nameIndex = index
        }
    }

    bw.write("${nameArray[nameIndex]}")
    bw.flush()
    bw.close()

    br.close()
}