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

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        var isGood = true
        val array = IntArray(n) {token.nextToken().toInt()}

        bw.write("Denominations: ${array[0]} ")
        for (i in 1 until n) {
            if (array[i-1] * 2 > array[i]){
                isGood = false
            }
            bw.write("${array[i]} ")
        }
        bw.write("\n")
        if (isGood) {
            bw.write("Good ")
        } else {
            bw.write("Bad ")
        }
        bw.write("coin denominations!\n\n")
    }

    bw.flush()
    br.close()
}
