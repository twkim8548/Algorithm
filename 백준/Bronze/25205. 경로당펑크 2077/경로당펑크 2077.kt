import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val s = br.readLine()

    if (s.last() != 'k' &&
        s.last() != 'i' &&
        s.last() != 'j' &&
        s.last() != 'u' &&
        s.last() != 'h' &&
        s.last() != 'y' &&
        s.last() != 'n' &&
        s.last() != 'b' &&
        s.last() != 'm' &&
        s.last() != 'l' &&
        s.last() != 'o' &&
        s.last() != 'p'
    ) bw.write("1")
    else bw.write("0")


    bw.flush()
    br.close()
}
