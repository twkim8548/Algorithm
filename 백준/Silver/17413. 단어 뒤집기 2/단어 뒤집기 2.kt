import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = br.readLine()
    var answer = StringBuilder()
    var isTag = false
    var temp = StringBuilder()

    string.forEach {
        if (it == '<' && !isTag) {
            isTag = true
            answer.append(temp.reversed())
            temp.clear()
            temp.append(it)
        } else if (it == '>' && isTag) {
            temp.append(it)
            isTag = false
            answer.append(temp)
            temp.clear()
        } else if (!isTag) {
            if (it == ' ') {
                answer.append(temp.reversed())
                answer.append(" ")
                temp.clear()
            } else {
                temp.append(it)
            }
        } else if (isTag) {
            temp.append(it)
        }

    }

    if (temp.isNotEmpty()) answer.append(temp.reversed())

    bw.write("$answer")
    bw.flush()
    bw.close()
    br.close()
}
