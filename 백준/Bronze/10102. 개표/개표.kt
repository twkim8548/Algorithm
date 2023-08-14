import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val v = br.readLine().toInt()
    val vote = br.readLine()
    var aCnt = 0
    var bCnt = 0
    vote.forEach {
        if (it =='A') aCnt++
        else bCnt++ 
    }

    if (aCnt > bCnt) bw.write("A")
    else if (bCnt > aCnt) bw.write("B")
    else bw.write("Tie")

    bw.flush()
    bw.close()

    br.close()
}
