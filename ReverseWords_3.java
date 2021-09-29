public class ReverseWords_3 {
    public String reverseWords(String s) {

        String[] stringArr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0;i < stringArr.length;i++){
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringArr[i]);
            stringBuilder.reverse();
            stringArr[i] = stringBuilder.toString();
        }
        s="";
        for(int i =0;i < stringArr.length;i++){
            s += stringArr[i];
            if( i != stringArr.length-1 ){
                s += " ";
            }
        }
        return s;
    }
    // Prototype Main
    public static void main(String[] args) {
        String s = "God Ding";
        ReverseWords_3 reverseWords = new ReverseWords_3();
        s = reverseWords.reverseWords(s);
        ConsoleLogger.writeInfo(s);
    }
}