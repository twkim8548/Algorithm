import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<AnswerTime>()
    val answerList = mutableListOf<String>()

    while (true) {
        val string = br.readLine()
        if (string == "-1") {
            break
        }

        val token = StringTokenizer(string)
        val answer = AnswerTime(token.nextToken().toInt(), token.nextToken(), token.nextToken() == "right")
        list.add(answer)
    }

    var answer = 0

    list.forEachIndexed { index, answerTime ->
        val question = answerTime.question
        if (!answerList.contains(question)) {
            var cnt = 0
            for (i in index until list.size) {
                if (question == list[i].question) {
                    if (list[i].isAnswer) {
                        answer += list[i].time
                        answer += (cnt * 20)
                        answerList.add(list[i].question)
                    } else {
                        cnt++
                    }
                }
            }
        }
    }
    bw.write("${answerList.size} $answer")

    bw.flush()
    bw.close()
}


data class AnswerTime(val time: Int, val question: String, val isAnswer: Boolean)