import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val name = br.readLine()

        if (name == null || name.isEmpty()) {
            break
        }
        
        var answer = ""

        name.forEach {
            if (it == 'i') {
                answer += 'e'
            } else if (it == 'e') {
                answer += 'i'
            } else if (it == 'E') {
                answer += 'I'
            } else if (it == 'I') {
                answer += 'E'
            } else {
                answer += it
            }
        }

        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()
}