class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        char[] arr = sb.toString().toCharArray();

        int left = 0;
        int right = arr.length -1;            


        if(arr.length == 0){
            return true;
        }

        while(left < right) {
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
