import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    while (true) {
        var string = br.readLine() ?: break

        while (string.contains("BUG")) {
            string = string.replace("BUG", "")
        }
        bw.write("${string}\n")
    }
    bw.flush()
    bw.close()

    br.close()
}
