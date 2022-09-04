import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    var answer =""

    if (s.contains("A")) {
        answer = s.replace("B", "A").replace("C","A").replace("D","A").replace("F","A")
    }else if (!s.contains("A") && s.contains("B")) {
        answer = s.replace("C","B").replace("D","B").replace("F","B")
    }else if (!s.contains("A")&& !s.contains("B")&& s.contains("C")) {
        answer = s.replace("D","C").replace("F","C")
    }else if (!s.contains("A")&&!s.contains("B")&& !s.contains("C")) {
        for (i in 0 until s.length)
        answer += "A"
    }
    bw.write("$answer")
    bw.flush()
    bw.close()
    br.close()
}