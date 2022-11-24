import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val array = (1..n).toMutableList()

    repeat(m) {
        token = StringTokenizer(br.readLine())

        val i = token.nextToken().toInt()
        val j = token.nextToken().toInt()

        val changeArray = IntArray(j - i + 1)
        var cnt = 0
        for (a in (i - 1 until j)) {
            changeArray[cnt] = array[a]
            cnt++
        }
        repeat(j - i + 1) {
            array.removeAt(i - 1)
        }
        changeArray.forEach {
            array.add(i - 1, it)
        }

    }
    array.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
}
