//import java.util.ArrayList;
//
//public class Problem6 {
//    public static void main(String[] args) {
//        House house1 = new House(12,402,40,4,2,"Pushkina","Five-story building",4);
//        House house2 = new House(12,402,10,5,4,"Tole","Five-story building",4);
//        House house3 = new House(12,402,56,8,3,"Aiteke","Five-story building",4);
//        House house4 = new House(12,402,120,2,1,"Jambyl","Five-story building",4);
//        House house5 = new House(12,402,15,1,3,"Jasorken","Five-story building",4);
//        House house6 = new House(12,402,40,2,5,"Pushkina","Five-story building",4);
//        ArrayList<House> houseArrayList = new ArrayList<>();
//        houseArrayList.add(house1);
//        houseArrayList.add(house2);
//        houseArrayList.add(house3);
//        houseArrayList.add(house4);
//        houseArrayList.add(house5);
//        houseArrayList.add(house6);
//
////        A)
////        int rooms = 3;
////        ArrayList<House> rommsneed = new ArrayList<>();
////        for(House s:houseArrayList){
////            if(s.number_of_room==rooms){
////                rommsneed.add(s);
////            }
////        }
////        System.out.println(rooms);
//
////        B)
////        int rooms = 3;
////        int floors = 2;
////        int floors2 = 5;
////        ArrayList<House> roomfloor = new ArrayList<>();
////        for(House s:houseArrayList){
////            if(s.number_of_room==rooms && (s.getFloor()>=floors && s.getFloor()<=floors2)){
////                roomfloor.add(s);
////            }
////        }
////        System.out.println(rooms);
//
////        C)
//        int squares = 35;
//        ArrayList<House> sqareneed = new ArrayList<>();
//        for(House s:houseArrayList){
//            if(s.square>squares){
//                sqareneed.add(s);
//            }
//        }
//        System.out.println(sqareneed);
//    }
//}
//
//class House{
//    int id;
//    int flat_number;
//    int square;
//    int floor;
//    int number_of_room;
//    String street;
//    String type_of_building;
//    int lifetime;
//
//    public House(int id, int flat_number, int square, int floor, int number_of_room, String street, String type_of_building, int lifetime) {
//        this.id = id;
//        this.flat_number = flat_number;
//        this.square = square;
//        this.floor = floor;
//        this.number_of_room = number_of_room;
//        this.street = street;
//        this.type_of_building = type_of_building;
//        this.lifetime = lifetime;
//    }
//
//    @Override
//    public String toString() {
//        return "House{" +
//                "id=" + id +
//                ", flat_number=" + flat_number +
//                ", square=" + square +
//                ", floor=" + floor +
//                ", number_of_room=" + number_of_room +
//                ", street='" + street + '\'' +
//                ", type_of_building='" + type_of_building + '\'' +
//                ", lifetime=" + lifetime +
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
//    public int getFlat_number() {
//        return flat_number;
//    }
//
//    public void setFlat_number(int flat_number) {
//        this.flat_number = flat_number;
//    }
//
//    public int getSquare() {
//        return square;
//    }
//
//    public void setSquare(int square) {
//        this.square = square;
//    }
//
//    public int getFloor() {
//        return floor;
//    }
//
//    public void setFloor(int floor) {
//        this.floor = floor;
//    }
//
//    public int getNumber_of_room() {
//        return number_of_room;
//    }
//
//    public void setNumber_of_room(int number_of_room) {
//        this.number_of_room = number_of_room;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getType_of_building() {
//        return type_of_building;
//    }
//
//    public void setType_of_building(String type_of_building) {
//        this.type_of_building = type_of_building;
//    }
//
//    public int getLifetime() {
//        return lifetime;
//    }
//
//    public void setLifetime(int lifetime) {
//        this.lifetime = lifetime;
//    }
//}
