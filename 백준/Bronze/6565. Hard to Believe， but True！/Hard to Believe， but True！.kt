import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val equation = br.readLine()
        if (equation == "0+0=0") {
            bw.write("True")
            break
        }

        val first = equation.split("+")[0]
        val second = equation.split("+")[1].split("=")[0]
        val answer = equation.split("=")[1]

        if (first.reversed().toBigInteger() + second.reversed().toBigInteger() == answer.reversed().toBigInteger()) {
            bw.write("True\n")
        } else {
            bw.write("False\n")
        }
    }

    bw.flush()
    br.close()
}
