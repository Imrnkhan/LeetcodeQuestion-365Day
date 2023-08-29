package Zap;

public class ExceptionHandleDiff {
//        public static void main(String args[]) {
//            try {
//                System.out.println("Inside the try block");
////below code throws divide by zero exception
//                int data = 25 / 0;
//                System.out.println(data);
//            }
////cannot handle Arithmetic type exception
////can only accept Null Pointer type exception
//            catch (NullPointerException e) {
//                System.out.println(e);
//            }
////executes regardless of exception occurred or not
//            finally {
//                System.out.println("finally block is always executed");
//            }
//            System.out.println("rest of the code...");
//        }


        public static void main(String args[]){
            try { // outer (main) try block
                try { //inner try block 1
                    try { // inner try block 2
                        int arr[] = { 1, 2, 3, 4 };
//printing the array element out of its bounds
                        System.out.println(arr[10]);
                    }
// to handles ArithmeticException
                    catch (ArithmeticException e) {
                        System.out.println("Arithmetic exception");
                        System.out.println(" inner catch block 2");
                    }
                }
// to handle ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println("inner catch block 1");
                }
            }
// to handle ArrayIndexOutOfBoundsException
            catch (ArrayIndexOutOfBoundsException hs) {
                System.out.println(hs);
                System.out.println(" outer (main) try block");
            }
            catch (Exception e5) {
                System.out.println("Exception");
                System.out.println(" handled in main try-block");
            }
        }
    }


