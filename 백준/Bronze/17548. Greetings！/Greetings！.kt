import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()
    str.forEach {
        if (it == 'e') {
            bw.write("ee")
        } else  {
            bw.write("$it")
        }
    }

    bw.flush()
    br.close()
}
