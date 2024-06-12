package DependencyInversionVSDependencyInjection;


    // Abstraction
    interface Printable {
        void printContent();
    }

    // Low-level module
    class Document implements Printable {
        public void printContent() {
            System.out.println("Printing document content");
        }
    }

    // High-level module
    class Printer {
        private Printable printable;

        public Printer(Printable printable) {
            this.printable = printable;
        }

        public void print() {
            printable.printContent();
        }
    }

    // Driver code
    public class  DependencyInversion {
        public static void main(String[] args) {
            Printable document = new Document();
            Printer printer = new Printer(document);
            printer.print();
        }
    }


/*
Dependency Inversion Principle (DIP)
DIP Concept:

High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces).
Abstractions should not depend on details. Details (implementations) should depend on abstractions.
 */