import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var s = br.readLine()
        if (s == "0") break

        var num = 1
        bw.write("$s ")
        while (s.length > 1) {
            s.forEach {
                num *= it.toString().toInt()
            }
            s = num.toString()
            bw.write("$s ")
            num = 1
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
