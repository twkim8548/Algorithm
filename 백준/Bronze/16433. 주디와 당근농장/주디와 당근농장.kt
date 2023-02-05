import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val r = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    val array = Array<BooleanArray>(n) { BooleanArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if ((r % 2 == 0 && c % 2 == 0) || (r % 2 != 0 && c % 2 != 0)) {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    array[i][j] = true
                }
            } else {
                if ((i % 2 != 0 && j % 2 == 0) || (i % 2 == 0 && j % 2 != 0)) {
                    array[i][j] = true
                }
            }
        }
    }

    array.forEach {
        it.forEach {
            if (it) {
                bw.write("v")
            } else {
                bw.write(".")
            }
        }
            bw.write("\n")
    }


    bw.flush()
    br.close()
}
