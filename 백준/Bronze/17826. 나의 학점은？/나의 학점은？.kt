import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val array = IntArray(50) { token.nextToken().toInt() }

    val hongik = br.readLine().toInt()

    val index = array.indexOf(hongik)

    if (index <= 4) {
        bw.write("A+")
    } else if (index <= 14) {
        bw.write("A0")
    } else if (index <= 29) {
        bw.write("B+")
    } else if (index <= 34) {
        bw.write("B0")
    } else if (index <= 44) {
        bw.write("C+")
    } else if (index <= 47) {
        bw.write("C0")
    } else {
        bw.write("F")
    }

    bw.flush()
    bw.close()
}