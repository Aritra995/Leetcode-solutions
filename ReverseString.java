public class ReverseString {
    public void reverseString(char[] s) {
        int left =0,right= s.length-1;
        while( right > left ){
            char tmp= s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
    //prototype main
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
        for (char c : s) {
            ConsoleLogger.writeInfo(c);
        }

    }
}
