import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String dayNum = bf.readLine();
		String carNum = bf.readLine();
		String[] carNumArray = carNum.split(" ");
		int result = 0;
		for (int i=0; i<carNumArray.length; i++){
			if(Integer.parseInt(dayNum) == Integer.parseInt(carNumArray[i])) {
				result++;
			}
		}

		System.out.println(result);


	}

}
