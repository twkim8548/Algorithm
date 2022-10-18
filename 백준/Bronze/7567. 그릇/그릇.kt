import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dishes = br.readLine()
    var answer = 10
    for (i in 1 until dishes.length) {
        answer += if (dishes[i-1] == dishes[i]) {
            5
        } else {
            10
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
