package ra.run;

import ra.bussinessImp.Book;

import java.util.Scanner;

import static java.nio.file.Files.delete;
import static sun.misc.Signal.handle;

public class BookManagement {
     static  Scanner scanner=new Scanner(System.in);
    static Book[] books=new Book[100];
     static int id=0;
    public static void main(String[] args) {
       int choie;
       while (true){
           System.out.printf("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                   "1. Nhập số sách và nhập thông tin sách \n" +
                   "2. Hiển thị thông tin các sách \n" +
                   "3. Sắp xếp sách theo lợi nhuận giảm dần \n" +
                   "4. Xóa sách theo mã sách \n" +
                   "5. Tìm kiếm sách theo tên sách \n" +
                   "6. Thay đổi trạng thái của sách theo mã sách \n" +
                   "7. Thoát");
           choie=Integer.parseInt(scanner.nextLine());
           handle(choie);
       }
    }

    private static void handle(int choie) {
        switch (choie){
            case 1:
                inputData();
                break;
            case 2:
                renderData();
                break;
            case 3:
                sortInterset();
                break;
            case 4:
                deleteId();
                break;
            case 5:
                seachName();
                break;
            case 6:
                updateStatus();
                break;
            case 7:
                System.exit(1);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }

    private static void updateStatus() {
        System.out.println("Nhập mã sách cần thay đổi trạng thái");
        int update= Integer.parseInt(scanner.nextLine());
        for (int i = 0;i<id;i++){
            if(update==books[i].getBookId()){
                books[i].displayData();
                books[i].setBookStatus(!books[i].getBookStatus());
                System.out.println("Thay đổi thành status thành công");
                books[i].displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy mã sách");
    }

    private static void seachName() {
        System.out.println("Nhập tên sách muốn tìm : ");
        String seachName=scanner.nextLine();
        for (int i = 0 ; i<id;i++){
            if(books[i].getBookName().equals(seachName)){
                books[i].displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy tên sách");
    }

    private static void deleteId() {
        System.out.println("Nhập tên sách muốn xóa");
        String deleteName = scanner.next();
        for (int i = 0;i<id;i++){
            if(books[i].getBookName().equals(deleteName)){

                for (int j = i; j < id - 1; j++) {
                    books[j] = books[j + 1];
                }
                id--;
                System.out.println("Đã xóa thành công");
                return;
            }
            }
        System.out.println("Không tìm thấy tên bạn muốn xóa");
        }

    private static void inputData() {
        Book book=new Book();
        book.inputData(scanner);
        books[id++]=book;
    }

    private static void renderData() {
    for (int i=0;i<id;i++){
        books[i].displayData();
    }
    }

    private static void sortInterset() {
        for (int i=0;i<id-1;i++){
            for (int j = i+1;j<id;j++){
                if(books[j].getInterest()<books[i].getInterest()){
                    Book temp = books[j];
                    books[j]=books[i];
                    books[i]=temp;

                }
            }
        }
        System.out.println("Sau khi sắp xep theo lợi nhuận");
        for (int k = 0;k<id;k++){
            books[k].displayData();
        }
    }
}
