package labor12_1;

public interface IDictionary {
    String DICTIONARY_FILE = "Labor8/dict.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}
