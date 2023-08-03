import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()

    val a = 100 - x
    val b = 100 - y
    val c = 100 - (a+b)
    val d = a*b
    val q  = d / 100
    val r = d % 100

    bw.write("$a $b $c $d $q $r\n${c+q} $r")

    bw.flush()
    bw.close()
}
