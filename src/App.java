import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String valasztott = "";

        do{
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
            valasztott = sc.nextLine();
            switch(valasztott){
                case "1":
                    System.out.println("Program...");
                    break;
                case "2":
                    System.out.println("Névjegy...");
                    break;
                case "3":
                System.out.println("Kilépés...");
                break;
            };    
        }while(!valasztott.equals("3"));
        

        sc.close();
    }
}
