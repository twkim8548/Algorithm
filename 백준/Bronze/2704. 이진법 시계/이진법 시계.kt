import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val time = br.readLine().split(":")
        val hour = time[0]
        val minute = time[1]
        val second = time[2]

        var hourArray = hour.toInt().toString(2)
        var minuteArray = minute.toInt().toString(2)
        var secondArray = second.toInt().toString(2)

        while (hourArray.length < 6) {
            hourArray = "0$hourArray"
        }
        while (minuteArray.length < 6) {
            minuteArray = "0$minuteArray"
        }
        while (secondArray.length < 6) {
            secondArray = "0$secondArray"
        }

        for (i in 0 until 6) {
            bw.write("${hourArray[i]}")
            bw.write("${minuteArray[i]}")
            bw.write("${secondArray[i]}")
        }
        bw.write(" ")

        hourArray.forEach {
            bw.write("$it")
        }
        minuteArray.forEach {
            bw.write("$it")
        }
        secondArray.forEach {
            bw.write("$it")
        }
        bw.write("\n")

    }

    bw.flush()
    br.close()
}
