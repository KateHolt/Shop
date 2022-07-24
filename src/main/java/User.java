public class User {
    int userId;
    String name;
    String surname;
    int sum;
    public User(int userId, String name, String surname, int sum){
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.sum = sum;
    }
    public int getUserId(){
        return this.userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getSum(){
        return this.sum;
    }
    public void setSum(int sum){
        this.sum = sum;
    }
    public String toString(){
        return this.userId + " " + this.name + " " + this.surname + " " + this.sum;
    }
}
