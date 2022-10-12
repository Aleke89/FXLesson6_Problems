//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Problem7 {
//    public static void main(String[] args) {
//        Phone phone1 = new Phone(12,"Abduvalov","Ersultan","Jaksylykulu","Jasorken",124,21,3,120);
//        Phone phone2 = new Phone(12,"Rysbek","Alnur","Erkinulu","Jasorken",124,21,3,10);
//        Phone phone3 = new Phone(12,"Amirtai","Damira","Adiletovna","Jasorken",124,21,3,40);
//        Phone phone4 = new Phone(12,"Suanbek","Dana","Alua","Jasorken",124,21,3,30);
//        Phone phone5 = new Phone(12,"Akbolatovna","Pupkin","Vasya","Jasorken",124,21,3,50);
//        Phone phone6 = new Phone(12,"Dastanulu","Mixalov","Sergei","Jasorken",124,21,3,0);
//        ArrayList<Phone> phoneArrayList = new ArrayList<>();
//        phoneArrayList.add(phone1);
//        phoneArrayList.add(phone2);
//        phoneArrayList.add(phone3);
//        phoneArrayList.add(phone4);
//        phoneArrayList.add(phone5);
//        phoneArrayList.add(phone6);
//
////        A)
////        int time_beril = 40;
////        ArrayList<Phone> more_time = new ArrayList<>();
////        for(Phone s:phoneArrayList){
////            if(s.getTime()>time_beril){
////                more_time.add(s);
////            }
////        }
////        System.out.println(more_time);
//
////        B)
////        ArrayList<Phone> intercity = new ArrayList<>();
////        for(Phone s:phoneArrayList){
////            if(s.getTime()>0){
////                intercity.add(s);
////            }
////        }
////        System.out.println(intercity);
//
////        C)
////        Collections.sort(phoneArrayList,new SortByName());
//    }
//}
//
//class Phone{
//    int id;
//    String surname;
//    String name;
//    String fatherland;
//    String adress;
//    int number_of_credit_card;
//    int debet;
//    int credit;
//    int time;
//
//    public Phone(int id, String surname, String name, String fatherland, String adress, int number_of_credit_card, int debet, int credit, int time) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.fatherland = fatherland;
//        this.adress = adress;
//        this.number_of_credit_card = number_of_credit_card;
//        this.debet = debet;
//        this.credit = credit;
//        this.time = time;
//    }
//
//    @Override
//    public String toString() {
//        return "Phone{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", fatherland='" + fatherland + '\'' +
//                ", adress='" + adress + '\'' +
//                ", number_of_credit_card=" + number_of_credit_card +
//                ", debet=" + debet +
//                ", credit=" + credit +
//                ", time=" + time +
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
//    public int getNumber_of_credit_card() {
//        return number_of_credit_card;
//    }
//
//    public void setNumber_of_credit_card(int number_of_credit_card) {
//        this.number_of_credit_card = number_of_credit_card;
//    }
//
//    public int getDebet() {
//        return debet;
//    }
//
//    public void setDebet(int debet) {
//        this.debet = debet;
//    }
//
//    public int getCredit() {
//        return credit;
//    }
//
//    public void setCredit(int credit) {
//        this.credit = credit;
//    }
//
//    public int getTime() {
//        return time;
//    }
//
//    public void setTime(int time) {
//        this.time = time;
//    }
//}
//class SortByName implements Comparator<Phone> {
//
//    @Override
//    public int compare(Phone first, Phone second) {
//        return first.getName().compareTo(second.getName());
//    }
//}