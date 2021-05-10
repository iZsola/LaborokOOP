package labor12_1;

public class DictionaryProvider
{
    public static IDictionary createDictionary(DictionaryType dt)
    {
        switch (dt)
        {
            case ARRAY_LIST:
                return ArrayListDictionary.getInstance();
            case HASH_SET:
                return HashSetDictionary.getInstance();
            case TREE_SET:
                return TreeSetDictionary.getInstance();
            default:
                break;
        }
        return null;
    }
}
