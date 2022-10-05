import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val string = br.readLine()
        
        if (string[(string.length / 2) - 1] == string[string.length/2]) bw.write("Do-it\n")
        else bw.write("Do-it-Not\n")
    }

    bw.flush()
    bw.close()
}