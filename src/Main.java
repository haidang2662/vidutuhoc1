import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong nhan vien : ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            System.out.println("Moi ban nhap id : ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Moi ban nhap ten : ");
            String name = scanner.nextLine();
            System.out.println("Moi ban nhap tuoi : ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Moi ban nhap so nam kinh nghiem lam viec : ");
            double exp = Double.parseDouble(scanner.nextLine());
            System.out.println("Moi ban nhap noi lam viec : ");
            String placeWork = scanner.nextLine();
            Employee employee = new Employee(id,name,age,exp,placeWork);
            System.out.println(employee);
            Employee[] employees = new Employee[n];
        }


    }
}