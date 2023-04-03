import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0.0

    while(true) {
        val item = br.readLine()

        if (item == "EOI") {
            break
        }


        when(item) {
            "Paper" -> {
                answer += 57.99
            }
            "Printer" -> {
                answer += 120.50
            }
            "Planners" -> {
                answer += 31.25
            }
            "Binders" -> {
                answer += 22.50
            }
            "Calendar" -> {
                answer += 10.95
            }
            "Notebooks" -> {
                answer += 11.20
            }
            "Ink" -> {
                answer += 66.95
            }
        }
    }

    bw.write("$$answer")

    bw.flush()
    bw.close()
}