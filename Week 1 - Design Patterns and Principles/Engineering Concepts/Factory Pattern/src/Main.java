public class Main {
    public static void main(String[] args) {
        DocumentFactory d=new WordDocFac();
        Document dr=d.create();
        dr.open();
        DocumentFactory g=new PdfDocFac();
        Document h=g.create();
        h.open();
    }
}