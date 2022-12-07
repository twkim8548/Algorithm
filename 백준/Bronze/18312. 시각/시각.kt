import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    var hour = 0
    var min = 0
    var sec = 0

    var answer = 0

    while (!(hour == n+1 && min == 0 && sec == 0)) {
        var hourTime = hour.toString()
        var minTime = min.toString()
        var secTime = sec.toString()
        if (hour < 10) {
            hourTime = "0$hour"
        }
        if (min < 10) {
            minTime = "0$min"
        }
        if (sec < 10) {
            secTime = "0$sec"
        }
        if (hourTime.contains(k.toString()) || minTime.contains(k.toString()) || secTime.contains(k.toString())) {
            answer++
        }
        if (sec == 59) {
            if (min == 59) {
                hour++
                min = 0
                sec = 0
            } else {
                min++
                sec = 0
            }
        } else {
            sec++
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}
