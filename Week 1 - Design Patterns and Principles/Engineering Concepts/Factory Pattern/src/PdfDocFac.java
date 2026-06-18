public class PdfDocFac implements DocumentFactory{
    public Document create()
    {
        return new PdfDoc();
    }
}
