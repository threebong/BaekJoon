import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        br.close();
        
        StringTokenizer st = new StringTokenizer(nums," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
     
        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
    }
}