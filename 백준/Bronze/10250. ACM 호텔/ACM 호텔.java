import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try{  
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            
            int test = Integer.parseInt(br.readLine());
            
            for(int i=0; i<test ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int H = Integer.parseInt(st.nextToken());
                st.nextToken();
                int N = Integer.parseInt(st.nextToken());
                if (N % H == 0) {
			    	sb.append((H * 100) + (N / H)).append(System.lineSeparator());
		    	} else {
			    	sb.append(((N % H) * 100) + ((N / H) + 1)).append(System.lineSeparator());
		        }            
            }
              System.out.print(sb);
        }catch(IOException e){

        }
        
    }
}