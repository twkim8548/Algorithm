import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val uphillArray = mutableListOf<Int>()
    val array = IntArray(br.readLine().toInt())
    val token = StringTokenizer(br.readLine())
    repeat(array.size) {
        array[it] = token.nextToken().toInt()
    }

    var isUphill = false
    var uphillSize = 0

    for (i in 0 until array.size - 1) {
        isUphill = array[i + 1] - array[i] >= 1

        if (isUphill) {
            uphillSize += array[i + 1] - array[i]
        }
        else {
            if (uphillSize != 0) {
                uphillArray.add(uphillSize)
            }
            uphillSize = 0
        }
        if (i == array.size - 2 && uphillSize != 0) {
            uphillArray.add(uphillSize)
            uphillSize = 0
        }
    }
    if (uphillArray.isEmpty()) bw.write("0")
    else bw.write("${uphillArray.maxOrNull()}")

    bw.flush()
    bw.close()

    br.close()
}