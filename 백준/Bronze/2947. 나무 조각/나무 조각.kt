import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val array = IntArray(5) { token.nextToken().toInt() }
    var cnt = 0
    while (true) {
        if (array.contentEquals(intArrayOf(1, 2, 3, 4, 5))) {
            break
        }
        if (array[cnt] > array[cnt + 1]) {
            val temp = array[cnt]
            array[cnt] = array[cnt + 1]
            array[cnt + 1] = temp

            array.forEach {
                bw.write("$it ")
            }
            bw.write("\n")
        } else {
            if (cnt == 3) {
                cnt = 0
            } else {
                cnt++
            }
        }


    }
    bw.flush()

    br.close()
}
