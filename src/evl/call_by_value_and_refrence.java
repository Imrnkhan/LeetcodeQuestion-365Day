package evl;

public class call_by_value_and_refrence {

        int data=50;

        void change(int data){

            data=data+100;//changes will be in the local variable only
        }

        public static void main(String args[]){
            call_by_value_and_refrence CS =new call_by_value_and_refrence();

            System.out.println("before change "+CS.data);
            CS.change(500);
            System.out.println("after change "+CS.data);

        }
    }

