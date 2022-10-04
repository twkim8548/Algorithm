import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val punch = br.readLine().split("(^0^)")

    var cnt = 0
    punch[0].forEach {
        if (it == '@') {
            cnt++
        }
    }
    bw.write("$cnt ")
    cnt = 0

    punch[1].forEach {
        if (it == '@') {
            cnt++
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
}