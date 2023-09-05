import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    val n = br.readLine().toInt()

    val array = IntArray(n)
    repeat(n) {
        token = StringTokenizer(br.readLine())
        array[it] += token.nextToken().toInt() * a + token.nextToken().toInt() * b + token.nextToken().toInt() * c
        token = StringTokenizer(br.readLine())
        array[it] += token.nextToken().toInt() * a + token.nextToken().toInt() * b + token.nextToken().toInt() * c
        token = StringTokenizer(br.readLine())
        array[it] += token.nextToken().toInt() * a + token.nextToken().toInt() * b + token.nextToken().toInt() * c
    }

    bw.write("${array.max()}")

    bw.flush()
    bw.close()
}