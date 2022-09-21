import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringBuilder sb = new StringBuilder();
        
        int test = Integer.parseInt(br.readLine());
        for(int i=0 ; i<test ; i++){
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            
            sb.append(String.valueOf(peopleNum(K,N))).append(System.lineSeparator());
        }
        System.out.print(sb);
        
    }
    
    public static int peopleNum(int K,int N){
        int[][] people = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            people[i][1]=1;
        }
        for(int i=0;i<N;i++){
            people[0][i+1]=i+1;
        }
        for(int i=1;i<=K;i++){
            for(int j=2;j<=N;j++){
                people[i][j] = people[i][j-1]+ people[i-1][j];
            }
        }
        
        return people[K][N];
    }
}