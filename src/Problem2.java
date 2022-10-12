//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Problem2 {
//    public static void main(String[] args) {
//        Customer customer = new Customer(1,"Aleke","Arman","Almaz","Taraz",112,140);
//        Customer customer1 = new Customer(1,"Aleke","Bake","Almaz","Taraz",120,141);
//        Customer customer2 = new Customer(1,"Aleke","Dastish","Almaz","Taraz",125,145);
//        Customer customer3 = new Customer(1,"Aleke","Meirman","Almaz","Taraz",115,149);
//        Customer customer4 = new Customer(1,"Aleke","Bangesh","Almaz","Taraz",114,152);
//        Customer customer5 = new Customer(1,"Aleke","Dias","Almaz","Taraz",118,154);
//        Customer customer6 = new Customer(1,"Aleke","Alnur","Almaz","Taraz",119,160);
//        ArrayList<Customer> customersArrayList = new ArrayList<>();
//        customersArrayList.add(customer);
//        customersArrayList.add(customer1);
//        customersArrayList.add(customer2);
//        customersArrayList.add(customer3);
//        customersArrayList.add(customer4);
//        customersArrayList.add(customer5);
//        customersArrayList.add(customer6);
////        A)
////        Collections.sort(customersArrayList,new SortByName());
////        for(Customer s:customersArrayList){
////            System.out.println(s.getName());
////        }
//
////        B)
////        int first = 115;
////        int second = 119;
////        ArrayList<Customer> interval_customer = new ArrayList<>();
////        for(Customer f:customersArrayList){
////            if(f.getNumber_card()>=first && f.getNumber_card()<=second){
////                interval_customer.add(f);
////            }
////        }
////        System.out.println("Customers in interval number card of 115-119:");
////        for(Customer f:interval_customer){
////            System.out.println(f);
////        }
//    }
//}
//class Customer{
//    int id;
//    String surname;
//    String name;
//    String fatherland;
//    String adress;
//    int number_card;
//    int number_bank_check;
//    public Customer(int id,String surname,String name,String fatherland,String adress,int number_card,int number_bank_check){
//        this.id =id;
//        this.surname =surname;
//        this.name =name;
//        this.fatherland =fatherland;
//        this.adress =adress;
//        this.number_card =number_card;
//        this.number_bank_check =number_bank_check;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", fatherland='" + fatherland + '\'' +
//                ", adress='" + adress + '\'' +
//                ", number_card=" + number_card +
//                ", number_bank_check=" + number_bank_check +
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
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
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
//    public String getFatherland() {
//        return fatherland;
//    }
//
//    public void setFatherland(String fatherland) {
//        this.fatherland = fatherland;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    public int getNumber_card() {
//        return number_card;
//    }
//
//    public void setNumber_card(int number_card) {
//        this.number_card = number_card;
//    }
//
//    public int getNumber_bank_check() {
//        return number_bank_check;
//    }
//
//    public void setNumber_bank_check(int number_bank_check) {
//        this.number_bank_check = number_bank_check;
//    }
//}
//class SortByName implements Comparator<Customer>{
//
//    @Override
//    public int compare(Customer first, Customer second) {
//        return first.getName().compareTo(second.getName());
//    }
//}