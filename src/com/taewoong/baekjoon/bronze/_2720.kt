import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
	repeat(br.readLine().toInt()) {
        var money = br.readLine().toInt() 
        var quarter = 0
        var dime = 0
        var nickel = 0
        var penny = 0
        if (money >= 25) {
        	quarter = money / 25
            money -= quarter * 25
        }
        if (money >= 10) {
			dime = money / 10
        	money -= dime * 10
        }
        if (money >= 5) {
            nickel = money / 5
	        money -= nickel * 5
        }
      
        penny = money 
        bw.write("$quarter $dime $nickel $penny\n")
    }
	bw.flush()
	bw.close()
	br.close()

}
