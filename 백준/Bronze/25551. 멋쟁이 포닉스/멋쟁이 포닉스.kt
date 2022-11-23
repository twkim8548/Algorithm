import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val bm = token.nextToken().toLong()
    val wm = token.nextToken().toLong()

    token = StringTokenizer(br.readLine())
    val bt = token.nextToken().toLong()
    val wt = token.nextToken().toLong()

    token = StringTokenizer(br.readLine())
    val bs = token.nextToken().toLong()
    val ws = token.nextToken().toLong()

    bw.write("${findVariations(bm, wm, bt, wt, bs, ws)}")
    bw.flush()
    bw.close()
}

fun findVariations(bm: Long, wm: Long, bt: Long, wt: Long, bs: Long, ws: Long): Long {
    val v1 = minOfThree(bm, wt, bs)
    val v2 = minOfThree(wm, bt, ws)
    var dif = kotlin.math.abs(v2 - v1)
    if (dif > 0) {
        dif = 1
    }
    return min(v1, v2) * 2 + dif
}

fun minOfThree(bm: Long, wt: Long, bs: Long): Long {
    return min(min(bm, wt), bs)
}