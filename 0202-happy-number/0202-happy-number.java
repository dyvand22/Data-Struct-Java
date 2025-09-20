class Solution {
    public int sumdg(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            n= n/10;
            sum += digit*digit;

        }
        return sum;
        
    }
    public boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet<>();
        while (n != 1){
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
                n= sumdg(n);
            }
        }
        return true;

        
        
    }
}