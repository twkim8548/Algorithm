import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        var answer = 0
        var i = 1
        while (i*i <= n) {
            if (i * i == n) answer++
            else if (n % i == 0) answer += 2
            i++
        }

        bw.write("$n ${answer}\n")
    }


    bw.flush()
    bw.close()
}