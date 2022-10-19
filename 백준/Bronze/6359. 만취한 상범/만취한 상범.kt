import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var step = 1
        val n = br.readLine().toInt()
        val array = Array(n) { _ -> false }

        repeat(n) {
            for (i in step - 1 until n step step) {
                array[i] = !array[i]
            }
            step++
        }
        bw.write("${array.count { it }}\n")
    }

    bw.flush()
    bw.close()
}
