import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    br.readLine().forEach {
        var sum = 0
        it.toInt().toString().forEach {
            sum += it.toString().toInt()
        }

        repeat(sum) { _ ->
            bw.write("$it")
        }
        bw.write("\n")

    }

    bw.flush()
    bw.close()

    br.close()
}
