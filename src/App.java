import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("-------------------");
        System.out.println();
        System.out.println("1) Program indítása");
        System.out.println();
        System.out.println("2) Névjegy");
        System.out.println();
        System.out.println("3) Kilépés");

        System.out.println();
        System.out.println();
        System.out.println("Valasztas:");
        String valasztott = sc.nextLine();
        

        sc.close();
    }
}
