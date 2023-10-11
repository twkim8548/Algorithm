import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()
    var answer = 0

    for (i in 0 .. str.length - 4) {
        if ("${str[i]}${str[i+1]}${str[i+2]}${str[i+3]}" == "DKSH") {
            answer ++
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}
