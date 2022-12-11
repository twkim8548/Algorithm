import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val l = token.nextToken().toInt()

    val array = mutableListOf<Int>()
    var teamCnt = 0

    repeat(n) {
        token = StringTokenizer(br.readLine())

        val x1 = token.nextToken().toInt()
        val x2 = token.nextToken().toInt()
        val x3 = token.nextToken().toInt()

        if (x1 >= l && x2>= l && x3 >= l && x1+x2+x3 >= k) {
            array.add(x1)
            array.add(x2)
            array.add(x3)

            teamCnt++
        }
    }

    bw.write("${teamCnt}\n")
    array.forEach {
        bw.write("$it ")
    }

    bw.flush()
    br.close()
}
