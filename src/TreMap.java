
import java.util.TreeMap;

public class TreMap implements WordSet {
    TreeMap<String, String> treeMap = new TreeMap<String, String>();

    @Override
    public void add(Word wordObject) {
        treeMap.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        treeMap.containsValue(word.getWord());
        if(treeMap.containsKey(word.getWord())==true){
            Word verdad=new Word();
            verdad.setWord(word.getWord());
            verdad.setType(treeMap.get(word.getWord()));
            return verdad;
        }else{
            return null;
        }
      }
}
