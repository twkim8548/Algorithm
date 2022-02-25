import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val password = br.readLine()

        if (password == "END") {
            break
        }

        bw.write("${password.reversed()}\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
