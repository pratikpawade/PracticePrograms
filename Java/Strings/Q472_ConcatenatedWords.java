import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q472_ConcatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashMap<String, Boolean> hm = new HashMap<>();
        Set<String> hs = new HashSet<>();
        for(String word : words) {
            hs.add(word);
        }
        List<String> result = new ArrayList<>();
        for(int i = 0; i<words.length ; i++) {
            if(IsConcatenated(words[i], hs, hm)) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public static boolean IsConcatenated(String word, Set<String> st, Map<String,Boolean> hm) {
        if(hm.containsKey(word)) {
            return hm.get(word);
        }
        for(int i=0 ; i<word.length() ; i++) {
            String prefix = word.substring(0,i+1);
            String suffix = word.substring(i+1, word.length());
            if(st.contains(prefix) && st.contains(suffix) || st.contains(prefix) && IsConcatenated(suffix, st, hm)) {
                hm.put(word, true);
                return true;
            }
        }
        hm.put(word, false);
        return false;
    }
}
