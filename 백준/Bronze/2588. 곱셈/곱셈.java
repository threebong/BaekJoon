import java.io.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(rs.readLine());
        String num2 = rs.readLine();
        
        int[] temp2 = new int[3];
        for(int i=0;i<3;i++){
            temp2[i]=Character.getNumericValue(num2.charAt(i));
        }
        
        System.out.println(num1 * temp2[2]);
        System.out.println(num1 * temp2[1]);
        System.out.println(num1 * temp2[0]);
        System.out.println(num1*temp2[2] + num1*temp2[1]*10 + num1*temp2[0]*100);
        
    }
}