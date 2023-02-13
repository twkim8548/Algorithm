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

    val token = StringTokenizer(br.readLine())

    val left = token.nextToken().toInt()
    val right = token.nextToken().toInt()

    if (left == 0 && right == 0) {
        bw.write("Not a moose")
    } else {
        if (left != right) {
            bw.write("Odd ")
            if (left > right) {
                bw.write("${left * 2}")
            } else {
                bw.write("${right * 2}")
            }
        } else {
            bw.write("Even ${left * 2}")
        }
    }
    bw.flush()
    bw.close()
}