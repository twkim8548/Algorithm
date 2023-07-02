import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val s = br.readLine()

    val array = IntArray(5)
    array[0] = s.count{ it == 'H' }
    array[1] = s.count{ it == 'I' }
    array[2] = s.count{ it == 'A' }
    array[3] = s.count{ it == 'R' }
    array[4] = s.count{ it == 'C' }

    bw.write("${array.min()}")

    bw.flush()
    bw.close()
}