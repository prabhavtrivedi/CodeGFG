class Solution {
    double power(double b, int e) {
       int n = e;    
       double ans = 1.0;
       
       if(n < 0) n = n * -1;
       
       while(n > 0){
        
        if(n % 2 == 1){
            ans *= b;
            n--;
        }else{
            b = b * b;
            n = n/2;
        }  
       }
       
       return (e < 0) ? 1/ans : ans;
       
    }
 
}
