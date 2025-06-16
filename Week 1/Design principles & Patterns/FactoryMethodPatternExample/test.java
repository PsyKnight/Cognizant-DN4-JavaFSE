public class test {
    public static void main(String[] args) {
        DocumentFactory df = new DocumentFactory();

        Document doc1 = df.createDocument("DN4.0-Deepskilling-Handbook-Java-FSE.pdf", 844, "Cognizant");
        System.out.println("Name: " + doc1.getName());
        System.out.println("Extension: " + doc1.getExtension());
        System.out.println("Owner: " + doc1.getOwner());
        System.out.println("Size: " + doc1.getSize()+ "KB");
        System.out.println("\n");

        Document doc2 = df.createDocument("DN 4.0 - Java FSE Mandatory hands-on detail.xlsx", 20, "Cognizant");
        System.out.println("Name: " + doc2.getName());
        System.out.println("Extension: " + doc2.getExtension() );
        System.out.println("Owner: " + doc2.getOwner());
        System.out.println("Size: " + doc2.getSize()+ "KB");
        System.out.println("\n");

        Document doc3 = df.createDocument("Design Patterns and Principles.docx", 20, "Cognizant");
        System.out.println("Name: " + doc3.getName());
        System.out.println("Extension: " + doc3.getExtension() );
        System.out.println("Owner: " + doc3.getOwner());
        System.out.println("Size: " + doc3.getSize()+ "KB");
    }
}