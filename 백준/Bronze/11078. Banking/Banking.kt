import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val pin = br.readLine().toCharArray().toMutableList()
    val m = br.readLine()
    var sum = 0

    m.forEach {
        sum += if (it.isLowerCase()) {
            it.toInt() - 96
        } else{
            it.toInt() - 64
        }
    }

    if (sum == pin.size) {
        var answer = 0
        m.forEach {
            var num = 0
            num = if (it.isLowerCase()) {
                it.toInt() - 96
            } else{
                it.toInt() - 64
            }
            if (it.isLowerCase()) {
                for (i in 0 until num) {
                    answer += pin[i].toString().toInt()
                }
                for (i in 0 until num) {
                    pin.removeAt(0);
                }
            } else {
                for (i in 0 until num) {
                    pin.removeAt(0);
                }
            }
        }
        bw.write("$answer")

    } else {
        bw.write("non sequitur")
    }

    bw.flush()
    br.close()
}
