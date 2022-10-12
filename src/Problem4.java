//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Problem4 {
//    public static void main(String[] args) {
//        Abiturient abiturient1 = new Abiturient(12,"Abduvalov","Ersultan","Jaksylykulu","Jasorken","87711593543",100);
//        Abiturient abiturient2 = new Abiturient(12,"Rysbek","Alnur","Erkinulu","Jasorken","87711593543",20);
//        Abiturient abiturient3 = new Abiturient(12,"Amirtai","Damira","Adiletovna","Jasorken","87711593543",0);
//        Abiturient abiturient4 = new Abiturient(12,"Suanbek","Dana","Alua","Jasorken","87711593543",80);
//        Abiturient abiturient5 = new Abiturient(12,"Akbolatovna","Pupkin","Vasya","Jasorken","87711593543",60);
//        Abiturient abiturient6 = new Abiturient(12,"Dastanulu","Mixalov","Sergei","Jasorken","87711593543",50);
//
//        ArrayList<Abiturient> abiturientsArrayList = new ArrayList<>();
//        abiturientsArrayList.add(abiturient1);
//        abiturientsArrayList.add(abiturient2);
//        abiturientsArrayList.add(abiturient3);
//        abiturientsArrayList.add(abiturient4);
//        abiturientsArrayList.add(abiturient5);
//        abiturientsArrayList.add(abiturient6);
//
////        A)
////        ArrayList<Abiturient> not_good_marks = new ArrayList<>();
////        for(Abiturient f: abiturientsArrayList){
////            if(f.getMarks()<69){
////                not_good_marks.add(f);
////            }
////        }
////        System.out.println("Not good abiturents");
////        for (Abiturient d:not_good_marks) {
////            System.out.println(d);
////        }
//
////        B)
////        int mark = 75;
////        ArrayList<Abiturient> more_than = new ArrayList<>();
////        for(Abiturient d:abiturientsArrayList){
////            if(d.getMarks()>mark){
////                more_than.add(d);
////            }
////        }
////        System.out.println("More than given mark");
////        for(Abiturient f:more_than){
////            System.out.println(f);
////        }
//
////        C)
////        int n = 3;
////        Collections.sort(abiturientsArrayList,new SortByMarks());
////        ArrayList<Abiturient> themost = new ArrayList<>();
////        System.out.println("The abiturents who gets the highest marks");
////        for(int i = 0;i<n;i++){
////            themost.add(abiturientsArrayList.get(i));
////        }
////        System.out.println(themost);
//
//
////        C2)
////        for(Abiturient f:abiturientsArrayList){
////            if(f.getMarks()>70){
////                System.out.println(f);
////            }
////        }
//
//    }
//}
//class SortByMarks implements Comparator<Abiturient> {
//
//    @Override
//    public int compare(Abiturient first, Abiturient second) {
//        if(first.getMarks() == second.getMarks()){
//            return 0;
//        }else if(first.getMarks()>second.getMarks()){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
//}
//class Abiturient{
//    int id;
//    String surname;
//    String name;
//    String fatherland;
//    String adress;
//    String phone_number;
//    int marks;
//
//    public Abiturient(int id, String surname, String name, String fatherland, String adress, String phone_number, int marks) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.fatherland = fatherland;
//        this.adress = adress;
//        this.phone_number = phone_number;
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "Abiturient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", fatherland='" + fatherland + '\'' +
//                ", adress='" + adress + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", marks=" + marks +
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
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}
