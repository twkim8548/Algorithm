import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())

        val speed = token.nextToken().toDouble()
        val weight = token.nextToken().toInt()
        val strength = token.nextToken().toInt()

        var isPosition = false

        if (speed == 0.0 && weight == 0 && strength == 0) {
            break
        }

        if (speed <= 4.5 && weight >= 150 && strength >= 200) {
            isPosition = true
            bw.write("Wide Receiver ")
        }
        if (speed <= 6.0 && weight >= 300 && strength >= 500) {
            isPosition = true
            bw.write("Lineman ")
        }
        if (speed <= 5.0 && weight >= 200 && strength >= 300) {
            isPosition = true
            bw.write("Quarterback ")
        }
        if (!isPosition) {
            bw.write("No positions")
        }

        bw.write("\n")
    }

    bw.flush()
    br.close()
}
