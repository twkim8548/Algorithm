import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var answer = 0
    repeat(n) {
        var sum = 0
        (it + 1).toString().forEach {num ->
            sum += num.toString().toInt()
        }

        if ((it + 1) % sum == 0) {
            answer ++
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}