public class BooK {
    private static int increase=0;
    private String title;
    private String author;
    private double price;
    private int copiesAvailable;
    private int idIncrease=0;

    public BooK(String title, String author, double price, int copiesAvailable){
        this.title=title;
        this.author=author;
        this.price=price;
        this.copiesAvailable=copiesAvailable;
        this.idIncrease=++increase;
    }
    public BooK(){
        this.title="None";
        this.author="None";
        this.price=0.0;
        this.copiesAvailable=0;
        this.idIncrease+=1;
    }
    //Methods
    public int getIdIncrease() {return idIncrease;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public int getCopiesAvailable() {return copiesAvailable;}
    public void setCopiesAvailable(int copiesAvailable) {this.copiesAvailable = copiesAvailable;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public void sellCopies(int amountSell){
        if(amountSell<=copiesAvailable&&amountSell>0){
            this.copiesAvailable-=amountSell;
            System.out.printf("Books Sold:%d\nBooks Available:%d\n",amountSell,copiesAvailable);
        }else{
            System.out.println("Error Sell Book\n");
        }
    }
    public void increaseCopies(int amountIncrease){
        this.copiesAvailable+=amountIncrease;
        System.out.printf("Copies Available:%d\n",copiesAvailable);
    }
    @Override
    public String toString() {
        return "Book[" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", copiesAvailable=" + copiesAvailable +
                ", idIncrease=" + idIncrease +
                ']';
    }
}
