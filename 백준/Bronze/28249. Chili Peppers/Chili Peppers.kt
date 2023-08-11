import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    repeat(br.readLine().toInt()) {
        when(br.readLine()) {
            "Poblano" -> answer += 1500
            "Mirasol" -> answer += 6000
            "Serrano" -> answer += 15500
            "Cayenne" -> answer += 40000
            "Thai" -> answer += 75000
            "Habanero" -> answer += 125000
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}
