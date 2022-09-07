import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var s = br.readLine()
        if (s.equals("#")) {
            break
        }
        if (!s.contains('a') && !s.contains('e') && !s.contains('i') && !s.contains('o') && !s.contains('u'))
            bw.write("${s}ay\n")
        else {

            while (true) {
                if (s[0] == 'a' || s[0] == 'e' || s[0] == 'i' || s[0] == 'o' || s[0] == 'u') {
                    break
                }
                s += s[0]
                s = s.substring(1)
            }
            bw.write("${s}ay\n")
        }
    }

    bw.flush()
    br.close()
}
