package ra.bussinessImp;

import java.util.Scanner;

 public class Book {
    int bookId;
    String bookName;
    String title;
    int NumberOfPages;
    float importPrice;
    float exportPrice;
    float interest;
    Boolean bookStatus;

     public int getBookId() {
         return bookId;
     }

     public void setBookId(int bookId) {
         this.bookId = bookId;
     }

     public String getBookName() {
         return bookName;
     }

     public void setBookName(String bookName) {
         this.bookName = bookName;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public int getNumberOfPages() {
         return NumberOfPages;
     }

     public void setNumberOfPages(int numberOfPages) {
         NumberOfPages = numberOfPages;
     }

     public float getImportPrice() {
         return importPrice;
     }

     public void setImportPrice(float importPrice) {
         this.importPrice = importPrice;
     }

     public float getExportPrice() {
         return exportPrice;
     }

     public void setExportPrice(float exportPrice) {
         this.exportPrice = exportPrice;
     }

     public float getInterest() {
         return this.exportPrice-this.importPrice;
     }

     public void setInterest(float interest) {
         this.interest = interest;
     }

     public Boolean getBookStatus() {
         return bookStatus;
     }

     public void setBookStatus(Boolean bookStatus) {
         this.bookStatus = bookStatus;
     }

     public Book(int bookId, String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest, Boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        NumberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

     public Book() {

     }

     public float profit(float exportPrice,float importPrice){
        return this.exportPrice-this.importPrice;
     }
     public  void inputData(Scanner scanner) {
         System.out.println("Nhập id sách: ");
         bookId = Integer.parseInt(scanner.nextLine());
         System.out.println("Nhập tên sách: ");
         bookName = scanner.nextLine();
         System.out.println("Nhập tiêu đề: ");
         title = scanner.nextLine();
         System.out.println("Nhập giá nhập: ");
         importPrice = Float.parseFloat(scanner.nextLine());
         System.out.println("Nhập giá xuất: ");
         exportPrice = Float.parseFloat(scanner.nextLine());
         System.out.println("Trạng Thái: ");
         bookStatus = Boolean.parseBoolean(scanner.nextLine());
     }
     public void displayData(){
         System.out.println("  id sách " + bookId );
         System.out.println("  tên sách " +bookName);
         System.out.println("  tiêu đề " + title);
         System.out.println("  giá nhập " + importPrice);
         System.out.println("  giá xuất " + exportPrice);
         System.out.println(" Lợi Nhuận " + profit(exportPrice,importPrice));
         System.out.println(" Trạng Thái " + bookStatus);
     }

}
