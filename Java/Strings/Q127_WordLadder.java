import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Q127_WordLadder {
    Set<String> dict;
    Queue<String> queue = new LinkedList<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        dict = new HashSet<>(wordList);
        int count = 1;
        queue.add(beginWord);

        // BFS search the path
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                String first = queue.poll();
                if(first.equals(endWord)) {
                    return count;
                }
                visitConnectNodes(first);
            }
            count++;
        }
        return 0;
    }

    private void visitConnectNodes(String str) {
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char cuChar = arr[i];
            for(char character = 'a'; character <= 'z'; character++) {
                arr[i] = character;
                String curString = new String(arr);
                if(dict.contains(curString)) {
                    dict.remove(curString);
                    queue.add(curString);
                }
            }
            arr[i] = cuChar;
        }
    }
}
