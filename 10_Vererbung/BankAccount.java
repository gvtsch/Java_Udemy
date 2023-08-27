    public class BankAccount {
        
        /**
         * (1) Erstelle eine private Variable für 
         *     den Kontostand mit dem Namen 
         *     "balance" als double
         */ 
        private double balance;
     
        /**
         * (2) Erstelle einen (public) Constructor, 
         *     bei dem der Kontostand übergeben 
         *     werden kann
         */ 
        public BankAccount(double balance) {
            this.balance = balance;
        }
        
        /**
         * (3) Erstelle einen Getter für den 
         *     Kontostand (public double getBalance())
         */
        public double getBalance() {
            return this.balance;
        }
        
        /**
         * (4) Erstelle eine Methode, mit der Geld 
         *     vom Konto abgehoben werden kann 
         *     (public void withdraw(double amount))
         */
        public void withdraw(double amount) {
            this.balance = this.balance - amount;
        }
    }