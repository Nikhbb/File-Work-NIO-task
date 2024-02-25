package app;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть назву файла: ");
        Helper.BASE_URL = "files/" + sc.next() + ".txt";

        printMenu();
        getResponse(sc, sc.nextInt());
    }

    private static void printMenu() {
        System.out.print("""
                МЕНЮ
                0 - вихід
                1 - створити та записати;
                2 - читати.
                Ваш вибір:""");
    }

    private static void getResponse(Scanner sc, int userNumber){
        switch (userNumber) {
            case 0:
                System.out.println("See you");
                break;
            case 1:
                System.out.print("Введіть текст: ");
                System.out.println(new FileWriteService().writeToFile(Helper.BASE_URL, sc.next()));
                break;
            case 2:
                System.out.println("\n>> Вміст файлу " + Helper.BASE_URL);
                System.out.println(new FileReadService().readFromFile(Helper.BASE_URL));
                break;
            default:
                System.out.println("Спробуйте ще раз...");
        }
    }

}
