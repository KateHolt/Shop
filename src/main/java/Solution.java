import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void showList(Map map){
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> pair = iterator.next();
            String value = pair.getValue();
            System.out.println(value);
        }
    }

    public static int menu(){
        int choice;
        System.out.println("Please select one of the options!");
        System.out.println("0 - Exit");
        System.out.println("1 - Show list of products");
        System.out.println("2 - Show list of users");
        System.out.println("3 - Buy a product");
        System.out.println("4 - Show user's purchases");
        System.out.println("5 - Show users who bought product");
        System.out.println("Your choice is - ");
        choice = sc.nextInt();
        return choice;
    }

    public static Map buy(Map<Integer, Product> mapPr, Map<Integer, User> mapUs, int idP, int idU){
        Map<User, Product> usPr = new HashMap<User, Product>();
        if(mapPr.get(idP).getPrice() < mapUs.get(idU).getSum()){
            int res = mapUs.get(idU).getSum() - mapPr.get(idP).getPrice();
            mapUs.get(idU).setSum(res);
            usPr.put(mapUs.get(idU), mapPr.get(idP));
            System.out.println("You bought this product. Thank you!");
        }
        else{
            throw new ArithmeticException("You can't buy this product, because you don't have enough money!");
        }
        return usPr;
    }

    public static void showBoughtProducts(Map<User, Product> UP, Map<Integer, User> MU, int id){

    }

    public static void main(String[] args){
        //Scanner s = new Scanner(System.in);
        Product product1 = new Product(1, "Stapler", 50);
        Product product2 = new Product(2, "Scissor", 75);
        Product product3 = new Product(3, "Copybook", 35);
        User user1 = new User(1, "Jade", "West", 300);
        User user2 = new User(2, "Back", "Oliver", 50);
        User user3 = new User(3, "Cat", "Valentaine", 20);

        Map<Integer, String> mapProducts = new HashMap<Integer, String>();
        mapProducts.put(product1.getId(), product1.getTitle());
        mapProducts.put(product2.getId(), product2.getTitle());
        mapProducts.put(product3.getId(), product3.getTitle());
        Map<Integer, String> mapUsers = new HashMap<Integer, String >();
        mapUsers.put(user1.getUserId(), user1.getName());
        mapUsers.put(user2.getUserId(), user2.getName());
        mapUsers.put(user3.getUserId(), user3.getName());

        Map<Integer, Product> mapP = new HashMap<Integer, Product>();
        mapP.put(product1.getId(), product1);
        mapP.put(product2.getId(), product2);
        mapP.put(product3.getId(), product3);

        Map<Integer, User> mapU = new HashMap<Integer, User>();
        mapU.put(user1.getUserId(), user1);
        mapU.put(user2.getUserId(), user2);
        mapU.put(user3.getUserId(), user3);

        Map<User, Product> up;
        Map<User, Product> UP = new HashMap<User, Product>();

        int number;
        boolean t = true;
        while(t){
            number = menu();
            switch (number){
                case 0:
                    t = false;
                    break;
                case 1:
                    System.out.println("List of shop's products:");
                    showList(mapProducts);
                    break;
                case 2:
                    System.out.println("List of users:");
                    showList(mapUsers);
                    break;
                case 3:
                    System.out.println("Please enter Id of user who want to buy product: ");
                    int idUs = sc.nextInt();
                    System.out.println("Please enter Id of product which user want to buy: ");
                    int idPr = sc.nextInt();
                    up = buy(mapP, mapU, idPr, idUs);
                    Iterator<Map.Entry<User, Product>> iterator = up.entrySet().iterator();
                    while (iterator.hasNext()){
                        Map.Entry<User, Product> pair = iterator.next();
                        Product value = pair.getValue();
                        UP.put(pair.getKey(), pair.getValue());
                    }
                    Iterator<Map.Entry<User, Product>> it = up.entrySet().iterator();
                        while (it.hasNext()){
                            Map.Entry<User, Product> pair = it.next();
                            User key = pair.getKey();
                            Product value = pair.getValue();
                            System.out.println(key.toString() + " " + value.toString());
                        }
                    break;
                case 4:
                    System.out.println("Sorry this function will add later!");
                    break;
                case 5:
                    System.out.println("Sorry this function will add later!");
                    break;
            }
        }
    }
    //sc.close();
}
