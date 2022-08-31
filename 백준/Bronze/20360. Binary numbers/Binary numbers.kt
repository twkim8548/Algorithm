import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    br.readLine().toBigInteger().toString(2).reversed().forEachIndexed { index, c ->
        if (c == '1') bw.write("$index ")
    }
    bw.flush()

    br.close()
}
