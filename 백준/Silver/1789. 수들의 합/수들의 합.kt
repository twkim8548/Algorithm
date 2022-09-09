import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val S = br.readLine().toLong()

    var num = 1L
    var sum = 0L
    var result = 0L

    while (true) {
        sum += num
        result++

        if (sum > S) {
            break
        }
        num++
    }

    bw.write("${result - 1}")

    bw.flush()
    bw.close()

    br.close()
}
