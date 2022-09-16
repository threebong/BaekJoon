import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.print(cycle(num));

        br.close();
    }

    public static int cycle(int N){
        int count=0;
		int copy = N;
        
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
		} while (copy != N);
        return count;
    }
}