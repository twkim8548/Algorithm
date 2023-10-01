import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.Writer
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val xArray = IntArray(n)
    val yArray = IntArray(n)
    repeat(n) {
        val token = StringTokenizer(br.readLine())
        xArray[it] = token.nextToken().toInt()
        yArray[it] = token.nextToken().toInt()
    }

    bw.write("${((xArray.max()?.minus(xArray.min()!!))!! + (yArray.max()?.minus(yArray.min()!!))!!) * 2}")


    bw.flush()
    br.close()
}