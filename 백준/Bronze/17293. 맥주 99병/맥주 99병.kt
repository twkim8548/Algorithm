import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    val total = n

    while (n >= 0) {
        if (n > 1) {
            if (n-1 == 1) {
                bw.write("$n bottles of beer on the wall, $n bottles of beer.\n" +
                        "Take one down and pass it around, ${n-1} bottle of beer on the wall.\n")
            } else {
                bw.write("$n bottles of beer on the wall, $n bottles of beer.\n" +
                        "Take one down and pass it around, ${n-1} bottles of beer on the wall.\n")
            }
        } else if (n == 1) {
            bw.write("$n bottle of beer on the wall, $n bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n")
        } else {
            if (total == 1) {
                bw.write("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, $total bottle of beer on the wall.\n")
            } else {
                bw.write("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, $total bottles of beer on the wall.\n")
            }

        }
        bw.write("\n")
        n--

    }

    bw.flush()
    bw.close()
}
