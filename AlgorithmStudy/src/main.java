import java.io.*;


public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String oper = bf.readLine();
		String b = bf.readLine();
		int totalCount;
		String result = "1";


		switch (oper) {
			case "*" :
				totalCount = (a.length()-1)+(b.length()-1);
				for(int i=0; i<totalCount; i++){
					result = result + "0";
				}
				System.out.println(result);
				break;

			case "+" :
				if(a.length()> b.length()){
					result = a.substring(0,(a.length()-b.length())) + "1" + a.substring((a.length()-b.length())+1);
				} else if (a.length()<b.length()){
					result = b.substring(0,(b.length()-a.length())) + "1" + b.substring((b.length()-a.length())+1);
				} else {
					result = "2"+ a.substring(1);
				}
				System.out.println(result);
				break;
		}



	}

}
