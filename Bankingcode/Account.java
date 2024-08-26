public class Account {
        private String accountNumber;
            private String accountOwner;
                private double balance;
                    private boolean isActive;
                        private boolean isStudent;
                            private String accountType; // "student" or "working"
                                
                                    // Constructor
                                        public Account(String accountNumber, String accountOwner, double balance, boolean isActive, boolean isStudent) {
                                                this.accountNumber = accountNumber;
                                                        this.accountOwner = accountOwner;
                                                                this.balance = balance;
                                                                        this.isActive = isActive;
                                                                                this.isStudent = isStudent;
                                                                                        this.accountType = isStudent ? "student" : "working";
                                                                                            }

                                                                                                // Getters and Setters
                                                                                                    public String getAccountNumber() { return accountNumber; }
                                                                                                        public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
                                                                                                            public String getAccountOwner() { return accountOwner; }
                                                                                                                public void setAccountOwner(String accountOwner) { this.accountOwner = accountOwner; }
                                                                                                                    public double getBalance() { return balance; }
                                                                                                                        public void setBalance(double balance) { this.balance = balance; }
                                                                                                                            public boolean isActive() { return isActive; }
                                                                                                                                public void setActive(boolean isActive) { this.isActive = isActive; }
                                                                                                                                    public boolean isStudent() { return isStudent; }
                                                                                                                                        public void setStudent(boolean isStudent) { this.isStudent = isStudent; }
                                                                                                                                            public String getAccountType() { return accountType; }
                                                                                                                                                public void setAccountType(String accountType) { this.accountType = accountType; }
                                                                                                                                                }
                                                                                                                                                
}