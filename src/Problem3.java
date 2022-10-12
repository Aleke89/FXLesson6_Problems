//import java.util.ArrayList;
//
//public class Problem3 {
//    public static void main(String[] args) {
//        Patient patient1 = new Patient(21,"Abduvalov","Ersultan","Jaksylykulu","Jarkent","87715423656",48,"Miningid");
//        Patient patient2 = new Patient(21,"Rysbek","Alnur","Erkinulu","Jarkent","87715423656",89,"Autoimmune Diseases");
//        Patient patient3 = new Patient(21,"Amirtai","Damira","Adiletovna","Jarkent","87715423656",90,"Cholera");
//        Patient patient4 = new Patient(21,"Suanbek","Alua","Akbolatovna","Jarkent","87715423656",13,"Coronaviruses");
//        Patient patient5 = new Patient(21,"Pupkin","Vasya","Dastanulu","Jarkent","87715423656",1,"Miningid");
//        Patient patient6 = new Patient(21,"Mixalov","Sergei","Aleksandrovich","Jarkent","87715423656",3,"Dengue Fever");
//        ArrayList<Patient> patientsArrayList = new ArrayList<>();
//        patientsArrayList.add(patient1);
//        patientsArrayList.add(patient2);
//        patientsArrayList.add(patient3);
//        patientsArrayList.add(patient4);
//        patientsArrayList.add(patient5);
//        patientsArrayList.add(patient6);
//
////        A)
////        ArrayList<Patient> miningit = new ArrayList<>();
////        String miningit_diag = "Miningid";
////        for(Patient s:patientsArrayList){
////            if(s.getDiagnosis()==miningit_diag){
////                miningit.add(s);
////            }
////        }
////        System.out.println("Patients which have Miningid:");
////        for(Patient f:miningit){
////            System.out.println(f);
////        }
//
////        B)
////        int first = 1;
////        int second = 5;
////        ArrayList<Patient> interval = new ArrayList<>();
////        for(Patient s:patientsArrayList){
////            if(s.getNumber_medical_card()>=first && s.getNumber_medical_card()<=second){
////                interval.add(s);
////            }
////        }
////        System.out.println("Patients in interval 1-5");
////        for(Patient f: interval){
////            System.out.println(f);
////        }
//    }
//}
//class Patient{
//    int id;
//    String surname;
//    String name;
//    String fatherland;
//    String adress;
//    String phone_number;
//    int number_medical_card;
//    String diagnosis;
//    public Patient(int id,String surname,String name,String fatherland,String adress,String phone_number,int number_medical_card,String diagnosis){
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.fatherland = fatherland;
//        this.adress = adress;
//        this.phone_number = phone_number;
//        this.number_medical_card = number_medical_card;
//        this.diagnosis = diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", fatherland='" + fatherland + '\'' +
//                ", adress='" + adress + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", number_medical_card=" + number_medical_card +
//                ", diagnosis='" + diagnosis + '\'' +
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
//    public int getNumber_medical_card() {
//        return number_medical_card;
//    }
//
//    public void setNumber_medical_card(int number_medical_card) {
//        this.number_medical_card = number_medical_card;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//}
