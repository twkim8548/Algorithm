import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        repeat(br.readLine().toInt()) {
            bw.write("=")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}
