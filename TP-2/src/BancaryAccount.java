import javax.xml.crypto.dom.DOMCryptoContext;

public class BancaryAccount {
    //Atributtes
    private String identifier;
    private String name;
    private double balance;
    //Builder
    public BancaryAccount(String identifier,String name,double balance){
        this.identifier=identifier;
        this.name=name;
        this.balance=balance;
    }
    public BancaryAccount(){
        this.identifier="";
        this.name="";
        this.balance=0.0;
    }
    //Methods
    public String getName() {return name;
    }
    public String getIdentifier() {return identifier;
    }
    public double getBalance() {return balance;
    }
    public void setName(String name) {this.name = name;
    }
    public void setIdentifier(String identifier) {this.identifier = identifier;
    }
    public void setBalance(double balance) {this.balance = balance;
    }
    //Methods 2
    public double credit(double deposit){
        this.balance+=deposit;
        return balance;
    }
    public double debit(double deposit){
        if(deposit<=balance&&deposit>0){
            this.balance-=deposit;
            return balance;
        }else{
          System.out.println("Failed subtraction");
          return balance;
        }
    }
    @Override
    public String toString() {
        return "BancaryAccount:\n" +
                "balance=" + balance +
                ", identifier='" + identifier + '\'' +
                ", name='" + name + '\'';
    }
}
