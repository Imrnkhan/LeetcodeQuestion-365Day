package evl;

public class call_by_value {

        int data=50;

        void change(int data){

            data=data+100;//changes will be in the local variable only
        }

        public static void main(String args[]){
                call_by_value hs =new call_by_value();

            System.out.println("before change "+hs.data);
            hs.change(500);
            System.out.println("after change "+hs.data);

        }
    }

