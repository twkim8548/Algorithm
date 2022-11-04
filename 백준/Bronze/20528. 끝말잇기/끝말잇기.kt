import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.round
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var isSuccess = true

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    val array = Array<String>(n) {token.nextToken()}
    val char = array[0][0]
    array.forEach {
        if (char != it[0] || char != it[it.length - 1]) {
            isSuccess = false
        }
    }
    if (isSuccess) bw.write("1")
    else bw.write("0")
    bw.flush()
    bw.close()
}
