//import java.util.ArrayList;
//import java.util.concurrent.atomic.AtomicReferenceArray;
//
//public class Problem9 {
//    public static void main(String[] args) {
//        Product product1 = new Product(12,"Oil","AIO","Reivel",2150,2,4000);
//        Product product2= new Product(12,"Oil","AIO","Reivel",250,5,1000);
//        Product product3 = new Product(12,"Benzin","AIO","Reivel",450,8,5000);
//        Product product4 = new Product(12,"Dizel","AIO","Reivel",4800,4,100);
//        Product product5 = new Product(12,"Oil","AIO","Reivel",4150,5,500);
//        Product product6 = new Product(12,"Gaz","AIO","Reivel",150,2,20);
//        ArrayList<Product> productArrayList = new ArrayList<>();
//        productArrayList.add(product1);
//        productArrayList.add(product2);
//        productArrayList.add(product3);
//        productArrayList.add(product4);
//        productArrayList.add(product5);
//        productArrayList.add(product6);
//
////        A)
////        String name_needed = "Oil";
////        ArrayList<Product> names = new ArrayList<>();
////        for(Product s:productArrayList){
////            if(s.getName()==name_needed){
////                names.add(s);
////            }
////        }
////        System.out.println(names);
//
////        B)
////        String name_needed = "Oil";
////        int price_needed = 2500;
////        ArrayList<Product> names = new ArrayList<>();
////        for(Product s:productArrayList){
////            if(s.getName()==name_needed && s.getPrice()<2500){
////                names.add(s);
////            }
////        }
////        System.out.println(names);
//
////        C)
////        int srok = 2;
////        ArrayList<Product> names = new ArrayList<>();
////        for(Product s:productArrayList){
////            if(s.getStorage_period()>srok){
////                names.add(s);
////            }
////        }
////        System.out.println(names);
//    }
//}
//
//class Product{
//    int id;
//    String name;
//    String UPC;
//    String manufacterer;
//    int price;
//    int storage_period;
//    int amount;
//
//    public Product(int id, String name, String UPC, String manufacterer, int price, int storage_period, int amount) {
//        this.id = id;
//        this.name = name;
//        this.UPC = UPC;
//        this.manufacterer = manufacterer;
//        this.price = price;
//        this.storage_period = storage_period;
//        this.amount = amount;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", UPC='" + UPC + '\'' +
//                ", manufacterer='" + manufacterer + '\'' +
//                ", price=" + price +
//                ", storage_period=" + storage_period +
//                ", amount=" + amount +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUPC() {
//        return UPC;
//    }
//
//    public void setUPC(String UPC) {
//        this.UPC = UPC;
//    }
//
//    public String getManufacterer() {
//        return manufacterer;
//    }
//
//    public void setManufacterer(String manufacterer) {
//        this.manufacterer = manufacterer;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getStorage_period() {
//        return storage_period;
//    }
//
//    public void setStorage_period(int storage_period) {
//        this.storage_period = storage_period;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
//}
