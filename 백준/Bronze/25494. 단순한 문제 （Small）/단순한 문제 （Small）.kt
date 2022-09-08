import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()
        var answer = 0
        for (i in 1..a) {
            for (j in 1..b) {
                for (k in 1..c) {
                    if (i % j == j % k && j % k == k % i)
                        answer++
                }
            }
        }
        bw.write("$answer\n")
    }



    bw.flush()
    br.close()
}
