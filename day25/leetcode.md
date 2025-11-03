# Question : 
https://leetcode.com/problems/count-primes/
## Solution : 
```
class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean [] isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(boolean prime:isPrime){
            if(prime) count++;

        }
        return count;
    }
}
```

# Queston : 
https://leetcode.com/problems/perfect-number/
## Solution : 
```
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
}
```