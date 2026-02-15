public class ReportCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Report();
    }
}
