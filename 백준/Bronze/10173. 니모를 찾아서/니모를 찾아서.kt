import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == "EOI") break
        if (string.toLowerCase().contains("nemo")) bw.write("Found\n")
        else bw.write("Missing\n")
    }

    bw.flush()
    br.close()
}