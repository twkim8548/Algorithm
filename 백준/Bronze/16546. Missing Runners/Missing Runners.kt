import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    val map = mutableMapOf<BigInteger, Boolean>()

    repeat(n) {
        if (map[it.toBigInteger() + BigInteger.ONE] == null) {
            map[it.toBigInteger() + BigInteger.ONE] = false
        }
    }

    repeat(n - 1) {
        val num = token.nextToken().toBigInteger()
        if (map[num] != null) {
            map[num] = true
        }
    }

    bw.write("${map.toList().find { !it.second }?.first}")


    bw.flush()
    bw.close()
}