package labor12_1;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        DictionaryService service = new
                DictionaryService(DictionaryType.ARRAY_LIST);
        service.findWordsFile("Labor12/bible.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds(Array_List): " +
                timeElapsed / 1000000);

        startTime = System.nanoTime();
        service = new
                DictionaryService(DictionaryType.TREE_SET);
        service.findWordsFile("Labor12/bible.txt");
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds(Tree_Set): " +
                timeElapsed / 1000000);

        startTime = System.nanoTime();
        service = new
                DictionaryService(DictionaryType.HASH_SET);
        service.findWordsFile("Labor12/bible.txt");
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds(Hash_Set): " +
                timeElapsed / 1000000);
    }
}
