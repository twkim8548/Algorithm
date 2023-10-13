import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    var num = 0
    var symbol = ""
    var idx = 0

    while (true) {
        val str = br.readLine()
        if (str == "=") {
            break
        }
        if (idx == 0) {
            answer = str.toInt()
        } else {
            if (idx % 2 == 0) {
                num = str.toInt()
                when (symbol) {
                    "+" -> answer += num
                    "/" -> answer /= num
                    "-" -> answer -= num
                    "*" -> answer *= num
                }
                symbol = ""
                num = 0
            } else {
                symbol = str
            }
        }
        idx++
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
