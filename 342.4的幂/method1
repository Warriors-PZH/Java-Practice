class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        int result = 1;
        for(int i= 0;i < 16;i++){
            if(n == result){
                return true;
            }
            result *= 4;
            if(result > n){
                break;
            }
        }
        return false;
    }
}
