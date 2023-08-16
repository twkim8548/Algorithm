import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val token = StringTokenizer(br.readLine())

        val name = token.nextToken()
        val age = token.nextToken().toInt()
        val weight = token.nextToken().toInt()

        if (name == "#" && age == 0 && weight == 0) {
            break
        }

        if (age > 17 || weight >= 80) {
            bw.write("$name Senior\n")
        } else {
            bw.write("$name Junior\n")
        }
    }

    bw.flush()
    bw.close()
}
