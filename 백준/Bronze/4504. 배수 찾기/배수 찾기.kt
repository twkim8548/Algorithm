import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    while (true) {
        val num = br.readLine().toInt()
        if (num == 0) break

        if (num % n == 0) bw.write("$num is a multiple of $n.\n")
        else bw.write("$num is NOT a multiple of $n.\n")
    }

    bw.flush()
    bw.close()

    br.close()
}