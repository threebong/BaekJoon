public class Test {
    long sum(int[] a) {
        int size = a.length;
        long ans = 0;
        for(int i=0; i<size; i++){
            ans += a[i];
        }
        
        return ans;
    }
}
