import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()
    val n = token.nextToken().toInt()

    var num = 0
    repeat(n) {
        num++
        if (num % x == 0 && num % y == 0) {
            bw.write("FizzBuzz\n")
        } else if (num % x == 0) {
            bw.write("Fizz\n")
        } else if (num % y ==0) {
            bw.write("Buzz\n")
        } else {
            bw.write("$num\n")
        }
    }

    bw.flush()
    bw.close()
}