import java.util.Stack;

public class Q71_SimplifyPath {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Stack<String> stack = new Stack();
        for(String i : arr) {
            if(i.equals("..") && !stack.empty()) {
                stack.pop();
            }
            else if(!i.equals("") && !i.equals(".") && !i.equals("..")) {
                stack.push(i); 
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String i : stack) {
            sb.append("/");
            sb.append(i);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
