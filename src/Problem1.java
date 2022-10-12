//import java.util.ArrayList;
//
//public class Problem1 {
//    public static void main(String[] args) {
//        Student student1 = new Student(1,"Alnur","Rysbek","Erkinovich",2008,"Jasorken","87711593543","IT","3E",3);
//        Student student2 = new Student(2,"Ersultan","Abduvalov","Jaksylykuly",2005,"Jarkent","87774562143","IT","3E",3);
//        Student student3 = new Student(2,"Arman","Abish","Tobetovich",2004,"Jarkent","87774562143","Buhgalteria","2D",2);
//        Student student4 = new Student(2,"Dastan","Mereihan","Daniarovich",2003,"Jarkent","87774562143","Buhgalteria","3D",3);
//        Student student5 = new Student(2,"Kuanysh","Korkenbaev","Aleskovich",2006,"Jarkent","87774562143","Marketing","2A",2);
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        studentArrayList.add(student1);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        studentArrayList.add(student4);
//        studentArrayList.add(student5);
//
////        A)
////        String faculted = "Buhgalteria";
////        for(Student a:studentArrayList){
////            if(a.getFaculted()==faculted){
////                System.out.println(a);
////            }
////        }
//
////        B)
////        String it = "IT";
////        String buhgalteria = "Buhgalteria";
////        String marketing = "Marketing";
////        for(Student a : studentArrayList){
////            if(a.getFaculted()==it && a.getCurse()==3){
////                System.out.println("Faculted IT  Third Course:\n"+a);
////            }else if(a.getFaculted()==buhgalteria && a.getCurse()==2){
////                System.out.println("Faculted Buhgalteria  Second Course :\n"+a);
////            }else if(a.getFaculted()==buhgalteria && a.getCurse()==3){
////                System.out.println("Faculted Buhgalteria  Third Course :\n"+a);
////            }else if(a.getFaculted()==marketing && a.getCurse()==2){
////                System.out.println("Faculted Marketing  Second Course :\n"+a);
////            }else if(a.getFaculted()==marketing && a.getCurse()==3){
////                System.out.println("Faculted Marketing  Third Course :\n"+a);
////            }
////        }
//
////        C)
////        int date = 2004;
////        for(Student a:studentArrayList){
////            if(a.getBirthday_date()>date){
////                System.out.println("Students born after 2004:\n"+a);
////            }
////        }
//
////        D)
////        ArrayList<String> groups = new ArrayList<>();
////        for(Student a:studentArrayList){
////            groups.add(a.getGroup());
////        }
////        System.out.println(groups);
//
//    }
//}
//class Student{
//    int id;
//    String surname;
//    String name;
//    String fatherland;
//    int birthday_date;
//    String adres;
//    String phone_number;
//    String faculted;
//    int curse;
//    String group;
//    public Student(int id,String name,String surname,String fatherland,int birthday_date,String adres,String phone_number,String faculted,String group,int curse){
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.fatherland = fatherland;
//        this.birthday_date = birthday_date;
//        this.adres = adres;
//        this.phone_number = phone_number;
//        this.faculted = faculted;
//        this.curse = curse;
//        this.group = group;
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getFatherland() {
//        return fatherland;
//    }
//
//    public int getBirthday_date() {
//        return birthday_date;
//    }
//
//    public String getAdres() {
//        return adres;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public String getFaculted() {
//        return faculted;
//    }
//
//    public int getCurse() {
//        return curse;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setFatherland(String fatherland) {
//        this.fatherland = fatherland;
//    }
//
//    public void setBirthday_date(int birthday_date) {
//        this.birthday_date = birthday_date;
//    }
//
//    public void setAdres(String adres) {
//        this.adres = adres;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public void setFaculted(String faculted) {
//        this.faculted = faculted;
//    }
//
//    public void setCurse(int curse) {
//        this.curse = curse;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", fatherland='" + fatherland + '\'' +
//                ", birthday_date='" + birthday_date + '\'' +
//                ", adres='" + adres + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", faculted='" + faculted + '\'' +
//                ", curse=" + curse +
//                ", group='" + group + '\'' +
//                '}';
//    }
//}
