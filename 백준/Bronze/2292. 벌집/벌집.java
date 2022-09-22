import java.lang.Math;
import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int i=1; ; i++){
            if(N==1){
              cnt = 1; 
              break;
            } 
            else{
                if((1+3*i*(i-1)) < N && N <= (1+3*(i)*(i+1))){
                    cnt = i+1;
                    break;
                }
            }
        }
        System.out.print(cnt);
    }
}