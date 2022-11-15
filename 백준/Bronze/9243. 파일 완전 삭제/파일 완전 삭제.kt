import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val old = br.readLine()
    var answer = ""
    val new = br.readLine()

    if (n % 2 == 1) {
        old.forEach {
            answer += if (it == '0') {
                '1'
            } else {
                '0'
            }
        }
    } else {
        answer = old
    }

    if (answer == new) {
        bw.write("Deletion succeeded")
    } else {
        bw.write("Deletion failed")
    }

    bw.flush()
    bw.close()
}