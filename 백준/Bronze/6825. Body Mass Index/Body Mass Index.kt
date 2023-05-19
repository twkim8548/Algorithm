import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val weight = br.readLine().toDouble()
    val height = br.readLine().toDouble()

    val bmi = weight / (height * height)

    if (bmi > 25) {
        bw.write("Overweight")
    } else if (bmi >= 18.5 ) {
        bw.write("Normal weight")
    } else {
        bw.write("Underweight")
    }

    bw.flush()
    bw.close()
}