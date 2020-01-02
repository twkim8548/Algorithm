import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        String numberString[] = bf.readLine().split(" ");
        int number[] = Arrays.stream(numberString).mapToInt(Integer::parseInt).toArray();
        int min = 0;

        boolean flag = true;
        for (int i = N-1; i >= 0; i--) {
            for (int j = N-2; j >= 0 ; j--) {
                if (i == j) {
                    continue;
                }
                for (int k = N-3; k >= 0 ; k--) {
                    if (i == k || i ==j || j == k) {
                        continue;
                    }
                    if (number[i] + number[j] + number[k] <= M) {
                        if (min < number[i] + number[j] + number[k]) {
                            min = number[i] + number[j] + number[k];
//                            System.out.println("최소 : " + min + "," + + number[i] + number[j] + number[k]);
                        }
                        if (number[i] + number[j] + number[k] == M) {
//                            System.out.println("똑같다! : " + number[i] + number[j] + number[k] );
                            min = number[i] + number[j] + number[k];
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag == false) {
                    break;
                }
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println(min);
    }


}
