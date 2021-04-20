package lab8_2;

public class DictionaryProvider
{
    public static IDictionary createDictionary(DictionaryType dt)
    {
        switch (dt)
        {
            case ARRAY_LIST:
                return ArrayListDictionary.getInstance();
            default:
                break;
        }
        return null;
    }
}
