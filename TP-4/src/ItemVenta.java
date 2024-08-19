public class ItemVenta {
    private static int account=0;
    private int identifier;
    private String description;
    private int amount;
    private double unitPrice;
    public ItemVenta(int identifier,String description,int amount,double unitPrice){
        this.identifier=++account;
        this.unitPrice=unitPrice;
        this.amount=amount;
        this.description=description;
    }
    public ItemVenta(){
        this.identifier=++account;
        this.unitPrice=0.0;
        this.amount=0;
        this.description="None";
    }
    ///Methods
    public double getUnitPrice() {return unitPrice;}
    public void setUnitPrice(double unitPrice) {this.unitPrice = unitPrice;}
    public int getIdentifier() {return identifier;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public int getAmount() {return amount;}
    public void setAmount(int amount) {this.amount = amount;}
    public double totalPrice(){
        return unitPrice*amount;
    }
    @Override
    public String toString() {
        return "ItemVenta[" +
                "amount=" + amount +
                ", identifier=" + identifier +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ']';
    }
}

