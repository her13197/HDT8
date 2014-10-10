
import java.util.Enumeration;
import java.util.Hashtable;

public class HasTable implements WordSet {
    Hashtable<String, String> balance = new Hashtable<String, String>();
    
    @Override
    public void add(Word wordObject) {
       balance.put(wordObject.getWord(),wordObject.getType());
    }
    @Override
    public Word get(Word word) {
        balance.containsValue(word.getWord());
        if(balance.containsKey(word.getWord())==true){
            Word verdad=new Word();
            verdad.setWord(word.getWord());
            verdad.setType(balance.get(word.getWord()));
            return verdad;
        }else{
            return null;
        }
      
    }
        
    
}
