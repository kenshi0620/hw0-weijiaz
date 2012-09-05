import java.io.StringReader;

import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;

/**
 * an exmaple of hw0 on 11719 F12
 * 
 * @author zhangweijia <weijiaz@andrew.cmu.edu>
 */

public class DependencyExample {
  public static void main(String[] args) {
    TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
    Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(args[0]));
    System.out.println(tokenizer.tokenize());
  }
}
