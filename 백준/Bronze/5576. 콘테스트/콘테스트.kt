import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val wArray = IntArray(10) {br.readLine().toInt()}
    val kArray = IntArray(10) {br.readLine().toInt()}

    wArray.sortDescending()
    kArray.sortDescending()
    bw.write("${wArray[0] + wArray[1] + wArray[2]} ")
    bw.write("${kArray[0] + kArray[1] + kArray[2]}")

    bw.flush()
    bw.close()

    br.close()
}
