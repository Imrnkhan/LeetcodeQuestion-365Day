package DependencyInversionVSDependencyInjection;
// constructor in injection


    // Abstraction
    interface Printables {
        void printContent();
    }

    // Low-level module


    class Documents implements Printable {
        public void printContent() {
            System.out.println("Printing document content");
        }
    }

    // High-level module
    class Printers {
        private Printable printable;

        // Constructor injection
        public Printers(Printable printable) {
            this.printable = printable;
        }

        public void print() {
            printable.printContent();
        }
    }

    // Driver code
    public class DependencyInjectionConstructor {
        public static void main(String[] args) {
            Printable document = new Documents();
            Printer printer = new Printer(document); // Dependency is injected via constructor
            printer.print();
        }
    }



    //It is the process in which we inject (provide) the object of
// one class to another class that depends on the object of the injected class

/*
// setter injection

interface Printable {
    void printContent();
}

class Document implements Printable {
    public void printContent() {
        System.out.println("Printing document content");
    }
}

class Printer {
    private Printable printable;

    // Setter injection
    public void setPrintable(Printable printable) {
        this.printable = printable;
    }

    public void print() {
        if (printable != null) {
            printable.printContent();
        } else {
            System.out.println("No printable content set.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printable document = new Document();
        Printer printer = new Printer();
        printer.setPrintable(document); // Dependency is injected through setter
        printer.print();
    }
}

 */