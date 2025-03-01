public class Q345_ReverseVowelsofaString {
    public String reverseVowels(String s) {
        
        int start = 0;
        int end = s.length() - 1;
        char[] ch = s.toCharArray();
        while(start < end) {
            if(!isVowel(ch[start])) {
                start++;
            }
            else if(!isVowel(ch[end])) {
                end--;
            }
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

        public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
