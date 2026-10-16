class Solution {
    public boolean isPalindrome(int x) {

        int temp;
        int sum = 0;
        int target = x;

        while(x > 0){
            temp = x % 10;
            x /= 10;
            sum  = sum * 10 + temp;
            System.out.println(sum);
        }
        return sum == target;
    }
}

