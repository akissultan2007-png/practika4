public class InvoiceCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Invoice();
    }
}
