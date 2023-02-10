import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.pow
import java.util.*
import kotlin.math.abs
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toDouble()
    val token = StringTokenizer(br.readLine())
    val d1 = token.nextToken().toDouble()
    val d2 = token.nextToken().toDouble()
    bw.write("${k.pow(2) - (abs(d1 - d2)/2).pow(2)}")

    bw.flush()
    bw.close()
}