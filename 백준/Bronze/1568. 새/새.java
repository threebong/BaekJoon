import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bird = Integer.parseInt(br.readLine());
        int k=1;
        int count = 1;
        for(;;){
            if(bird>k){
                bird -= k;
                count++;
                k++;
                continue;
            }else if(bird<k){
                k = 1;
            }else{
                break;
            }
        }
        System.out.print(count);
    } 
}