package evl;


    public class withdraw implements Runnable{
        private int amount;
        private Account account;

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account account) {
            this.account = account;
        }

        public withdraw(int amount, Account account) {
            this.amount = amount;
            this.account = account;

        }

        @Override
        public void run() {
            this.account.withdraw(this.amount);
        }
    }


