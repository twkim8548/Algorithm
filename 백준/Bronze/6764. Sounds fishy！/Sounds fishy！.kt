import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(4)
    repeat(4) {
        array[it] = br.readLine().toInt()
    }
    var isRising = false
    var isDiving = false
    var isConstant = false

    if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
        isRising = true
    } else if (array[0] > array[1] && array[1] > array[2] && array[2] > array[3]) {
        isDiving  = true
    } else if (array[0] == array[1] && array[1] == array[2] && array[2] == array[3]) {
        isConstant = true
    }

    if (isRising) bw.write("Fish Rising")
    else if (isDiving) bw.write("Fish Diving")
    else if (isConstant) bw.write("Fish At Constant Depth")
    else bw.write("No Fish")

    bw.flush()
    bw.close()

    br.close()
}
