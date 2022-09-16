import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        br.close();
        
        StringTokenizer st = new StringTokenizer(nums," ");
        //유효자릿수 == 정밀도
        //double.long 15~16자릿수 / float 7자릿수 
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        
        System.out.print(a/b);
        
    }
}