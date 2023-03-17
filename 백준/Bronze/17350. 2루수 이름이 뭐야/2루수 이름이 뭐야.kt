import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = Array(n) { _ -> br.readLine() }

    if (array.contains("anj")) {
        bw.write("뭐야;")
    } else {
        bw.write("뭐야?")
    }


    bw.flush()
    bw.close()
}
