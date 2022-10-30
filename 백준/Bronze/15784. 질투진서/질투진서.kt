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
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    val array = Array(n) { IntArray(n) }
    repeat(n) { row ->
        token = StringTokenizer(br.readLine())
        repeat(n) { col ->
            array[row][col] = token.nextToken().toInt()
        }
    }

    var isHandsome = false

    repeat(n) {
        if (array[it][b-1] > array[a-1][b-1]) {
            isHandsome = true
        }
    }

    repeat(n) {
        if (array[a-1][it] > array[a-1][b-1]) {
            isHandsome = true
        }
    }

    if (isHandsome) bw.write("ANGRY")
    else bw.write("HAPPY")


    bw.flush()
    br.close()
}
