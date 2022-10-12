import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = br.readLine()

    var cnt = string.length
    string.forEach {
        when (it) {
            'A' -> cnt += 2
            'B' -> cnt += 2
            'C' -> cnt += 2
            'D' -> cnt += 3
            'E' -> cnt += 3
            'F' -> cnt += 3
            'G' -> cnt += 4
            'H' -> cnt += 4
            'I' -> cnt += 4
            'J' -> cnt += 5
            'K' -> cnt += 5
            'L' -> cnt += 5
            'M' -> cnt += 6
            'N' -> cnt += 6
            'O' -> cnt += 6
            'P' -> cnt += 7
            'Q' -> cnt += 7
            'R' -> cnt += 7
            'S' -> cnt += 7
            'T' -> cnt += 8
            'U' -> cnt += 8
            'V' -> cnt += 8
            'W' -> cnt += 9
            'X' -> cnt += 9
            'Y' -> cnt += 9
            'Z' -> cnt += 9

        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
}