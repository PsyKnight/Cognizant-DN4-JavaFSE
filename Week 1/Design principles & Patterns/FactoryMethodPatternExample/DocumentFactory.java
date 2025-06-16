public class DocumentFactory {

    public Document createDocument(String fileName, int size, String owner) {
        // In case file name has multiple dots - document.model.pdf
        int dotIndex = fileName.lastIndexOf(".");

        String name = fileName.substring(0, dotIndex);
        String extension = fileName.substring(dotIndex + 1);

        switch (extension) {
            case "pdf":
                return new PdfDocument(name, size, owner);
            case "docx":
                return new WordDocument(name, size, owner);
            case "xlsx":
                return new ExcelDocument(name, size, owner);
            default:
                return null;
        }
    }
}