public class WordDocFac implements DocumentFactory {
    public Document create()
    {
        return new WordDoc();
    }
}
