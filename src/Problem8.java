//import java.util.ArrayList;
//
//public class Problem8 {
//    public static void main(String[] args) {
//        Car car1 = new Car(12,"Audi","190E",2002,"Black",2000,4801);
//        Car car2 = new Car(12,"Audi","124",1995,"Black",4000,4801);
//        Car car3 = new Car(12,"Mercedes","140E",2002,"Black",8000,4801);
//        Car car4 = new Car(12,"Mercedes","210E",2002,"Black",100,4801);
//        Car car5 = new Car(12,"Mercedes","211E",2007,"Black",20,4801);
//        Car car6 = new Car(12,"Audi","212C",2018,"Black",150,4801);
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//        carArrayList.add(car4);
//        carArrayList.add(car5);
//        carArrayList.add(car6);
//
////        A)
////        String marka = "Audi";
////        ArrayList<Car> markalar = new ArrayList<>();
////        for(Car s:carArrayList){
////            if(s.getMarka()==marka){
////                markalar.add(s);
////            }
////        }
////        System.out.println(markalar);
//
////        B)
////        String marka = "Audi";
////        int n = 10;
////        ArrayList<Car> markalar = new ArrayList<>();
////        for(Car s:carArrayList){
////            if(s.getMarka()==marka && (2022-s.getDate()>n)){
////                markalar.add(s);
////            }
////        }
////        System.out.println(markalar);
//
////        C)
//        int date_needed = 2002;
//        int price_needed = 2000;
//        ArrayList<Car> markalar = new ArrayList<>();
//        for(Car s:carArrayList){
//            if(s.getDate()==date_needed && s.getPrice()>price_needed){
//                markalar.add(s);
//            }
//        }
//        System.out.println(markalar);
//    }
//
//}
//
//class Car{
//    int id;
//    String marka;
//    String model;
//    int date;
//    String color;
//    int price;
//    int register_number;
//
//
//
//    public Car(int id, String marka, String model, int date, String color, int price, int register_number) {
//        this.id = id;
//        this.marka = marka;
//        this.model = model;
//        this.date = date;
//        this.color = color;
//        this.price = price;
//        this.register_number = register_number;
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
//    public String getMarka() {
//        return marka;
//    }
//
//    public void setMarka(String marka) {
//        this.marka = marka;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getDate() {
//        return date;
//    }
//
//    public void setDate(int date) {
//        this.date = date;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
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
//    public int getRegister_number() {
//        return register_number;
//    }
//
//    public void setRegister_number(int register_number) {
//        this.register_number = register_number;
//    }
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", marka='" + marka + '\'' +
//                ", model='" + model + '\'' +
//                ", date=" + date +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", register_number=" + register_number +
//                '}';
//    }
//}
