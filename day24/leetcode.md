# Question : 
https://leetcode.com/problems/reverse-integer/
## Solution : 
```
class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int rem= x%10;
            rev= rev*10+rem;
            if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
                return 0;
            }
            x=x/10;
        }
        return (int)rev;
    }
}
```
# Question : 
https://leetcode.com/problems/powx-n/
## Solution : 
```
class Solution {
    public double myPow(double x, int n) {
        double res=1;
        long pw= n;
        if(pw<0){
            x=1/x;
            pw=pw*(-1);
        }
        while(pw>0){
            if(pw%2==0){
                x=x*x;
                pw=pw/2;
            }else{
                res= res*x;
                pw--;
            }
        }
        return res;
    }
}
```

# Question: 
https://leetcode.com/problems/power-of-three/
## Solution : 
```
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
}
```