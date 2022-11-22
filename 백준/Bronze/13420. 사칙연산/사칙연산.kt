import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toBigInteger()
        val op = token.nextToken()
        val b = token.nextToken().toBigInteger()
        val c = token.nextToken()
        val answer = token.nextToken().toBigInteger()
        when (op) {
            "+" -> {
                if (a + b == answer) bw.write("correct")
                else bw.write("wrong answer")
            }
            "*" -> {
                if (a * b == answer) bw.write("correct")
                else bw.write("wrong answer")
            }
            "-" -> {
                if (a - b == answer) bw.write("correct")
                else bw.write("wrong answer")
            }
            "/" -> {
                if (a / b == answer) bw.write("correct")
                else bw.write("wrong answer")
            }
        }
        bw.write("\n")
    }


    bw.flush()
    bw.close()
}