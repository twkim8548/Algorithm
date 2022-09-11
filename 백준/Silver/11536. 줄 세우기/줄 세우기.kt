import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = Array<String>(n) { br.readLine() }
    val increaseArray = array.sortedArray()
    val decreaseArray = array.sortedArrayDescending()

    if (array.contentEquals(increaseArray)) {
        bw.write("INCREASING")
    } else if (array.contentEquals(decreaseArray)) {
        bw.write("DECREASING")
    } else {
        bw.write("NEITHER")
    }

    bw.flush()
    bw.close()

    br.close()
}
