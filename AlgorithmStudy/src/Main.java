import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(bf.readLine());
		int result = 1;

		for(int i=1; i<number+1; i++){
		    result = result * i;
        }
		System.out.println(result);

	}

}
