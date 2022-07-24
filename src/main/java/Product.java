public class Product {
    int id;
    String title;
    int price;
    public Product(int id, String title, int price){
        this.id = id;
        this.title = title;
        this.price = price;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String toString(){
        return this.id + " " + this.title + " " + this.price;
    }
}
