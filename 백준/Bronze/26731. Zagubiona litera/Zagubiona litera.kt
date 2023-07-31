import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = br.readLine().toCharArray()

    array.sort()
    var cnt = 65
    for (i in 0 until 25) {
        if (cnt != array[i].toInt()) {
            break
        }
        cnt++
    }
    bw.write("${cnt.toChar()}")
    bw.flush()
    br.close()
}
