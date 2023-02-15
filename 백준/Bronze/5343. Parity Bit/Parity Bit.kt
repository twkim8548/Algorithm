import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val string = br.readLine()
        var cnt = 1
        var sum = 0
        var error = 0
        while (cnt <= string.length) {
            if (cnt % 8 == 0) {
                if (sum % 2 == 0) {
                    if (string[cnt-1] == '1') {
                        error++
                    }
                } else {
                    if (string[cnt-1] == '0') {
                        error++
                    }
                }
                cnt ++
                sum = 0
            } else {
                if (string[cnt-1] == '1') {
                    sum++
                }
                cnt++
            }
        }
        bw.write("$error\n")
    }
    bw.flush()
    br.close()
}
