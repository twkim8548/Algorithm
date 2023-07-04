import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val mbti = br.readLine()

    mbti.forEach {
        if (it == 'I') {
            bw.write("E")
        } else if (it == 'E') {
            bw.write("I")
        }
        if (it == 'S') {
            bw.write("N")
        } else if (it == 'N') {
            bw.write("S")
        }
        if (it == 'T') {
            bw.write("F")
        } else if (it == 'F') {
            bw.write("T")
        }
        if (it == 'P') {
            bw.write("J")
        } else if (it == 'J') {
            bw.write("P")
        }
    }

    bw.flush()
    bw.close()
}