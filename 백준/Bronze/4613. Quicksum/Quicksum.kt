import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == "#") break

        var quickSum = 0

        string.forEachIndexed { index, c ->
            quickSum += if (c == ' ') 0
            else (c.code - 64) * (index + 1)
        }
        bw.write("$quickSum\n")
    }

    bw.flush()
    bw.close()

    br.close()
}