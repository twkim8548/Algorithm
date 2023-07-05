import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    val y = br.readLine().toInt()
    val z = br.readLine().toInt()

    if (x + y <= z) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()
}