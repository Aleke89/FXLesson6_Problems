//import java.util.ArrayList;
//
//public class Problem5 {
//    public static void main(String[] args) {
//        Book book1 = new Book(12,"Magia","Muhmed","Almaty",2004,145,"400$","idk");
//        Book book2 = new Book(12,"Magia","Mehmed","Almaty",2002,145,"400$","idk");
//        Book book3 = new Book(12,"Magia","Maki","Astana",2000,145,"400$","idk");
//        Book book4 = new Book(12,"Magia","Daki","Astana",2015,145,"400$","idk");
//        Book book5 = new Book(12,"Magia","Chelovek-Pauk","Almaty",2010,145,"400$","idk");
//        Book book6 = new Book(12,"Magia","Mehmed","Almaty",2008,145,"400$","idk");
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//        bookArrayList.add(book1);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        bookArrayList.add(book4);
//        bookArrayList.add(book5);
//        bookArrayList.add(book6);
////        A)
////        String author_i_need = "Mehmed";
////        ArrayList<Book> aftor = new ArrayList<>();
////        for(Book d:bookArrayList){
////            if(d.getAuthor()==author_i_need){
////                aftor.add(d);
////            }
////        }
////        System.out.println(aftor);
//
//
////        B)
////        String izdatelstvo = "Astana";
////        ArrayList<Book> izda = new ArrayList<>();
////        for(Book d:bookArrayList){
////            if(d.getAuthor()==izdatelstvo){
////                izda.add(d);
////            }
////        }
////        System.out.println(izda);
//
//
////        C)
////        int god = 2008;
////        ArrayList<Book> gody = new ArrayList<>();
////        for(Book d:bookArrayList){
////            if(d.getDate()>2008){
////                gody.add(d);
////            }
////        }
////        System.out.println(gody);
//    }
//}
//class Book{
//    int id;
//    String name;
//    String author;
//    String publisher;
//    int date;
//    int pages;
//    String cost;
//    String type_of_pere;
//
//    public Book(int id, String name, String author, String publisher, int date, int pages, String cost, String type_of_pere) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.date = date;
//        this.pages = pages;
//        this.cost = cost;
//        this.type_of_pere = type_of_pere;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", date=" + date +
//                ", pages=" + pages +
//                ", cost='" + cost + '\'' +
//                ", type_of_pere='" + type_of_pere + '\'' +
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
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
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
//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    public String getCost() {
//        return cost;
//    }
//
//    public void setCost(String cost) {
//        this.cost = cost;
//    }
//
//    public String getType_of_pere() {
//        return type_of_pere;
//    }
//
//    public void setType_of_pere(String type_of_pere) {
//        this.type_of_pere = type_of_pere;
//    }
//}
