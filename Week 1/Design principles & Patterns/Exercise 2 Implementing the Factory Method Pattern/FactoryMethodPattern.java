interface Document {
    void open();
    void close();
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document.");
    }

    public void close() {
        System.out.println("Closing Word document.");
    }
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document.");
    }

    public void close() {
        System.out.println("Closing PDF document.");
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document.");
    }

    public void close() {
        System.out.println("Closing Excel document.");
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        DocumentFactory word = new WordDocumentFactory();
        Document w = word.createDocument();
        w.open();
        w.close();

        DocumentFactory pdf = new PdfDocumentFactory();
        Document p = pdf.createDocument();
        p.open();
        p.close();

        DocumentFactory excel = new ExcelDocumentFactory();
        Document e = excel.createDocument();
        e.open();
        e.close();
    }
}
