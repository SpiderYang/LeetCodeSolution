package leetcode;

public class CountPrimes {
   static int countPrimes(int n){
       int  count = 0;
       boolean[] notPrime = new boolean[n];
       for (int i = 2; i <= n; i++){
           if (notPrime[i])
               continue;
            count++;
            for(int j = i; j <= n; j += i){
                notPrime[j] = true;
            }
       }
       return count;
   }

}
