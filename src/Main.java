import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Gourmet Bistro");

        restaurant.addDish(new Dish("Spaghetti Carbonara", 15.00, 300, "słodki"));
        restaurant.addDish(new Dish("T-bone Steak", 25.00, 500, "ostry"));
        restaurant.addDish(new Dish("Caesar Salad", 10.00, 250, "gorzki"));
        restaurant.addDish(new Dish("Chocolate Cake", 8.00, 200, "słodki"));
        restaurant.addDish(new Dish("Margherita Pizza", 12.00, 400, "słodki"));
        restaurant.addDish(new Dish("Tom Yum Soup", 18.00, 350, "ostry"));
        restaurant.addDish(new Dish("Grilled Salmon", 22.00, 300, "słodki"));
        restaurant.addDish(new Dish("Beef Burger", 16.00, 450, "słodki"));
        restaurant.addDish(new Dish("Green Salad", 9.00, 200, "gorzki"));
        restaurant.addDish(new Dish("Pad Thai", 14.00, 350, "ostry"));
        restaurant.addDish(new Dish("Lemon Tart", 7.00, 150, "gorzki"));
        restaurant.addDish(new Dish("Chicken Curry", 20.00, 400, "ostry"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1. Znajdź najdroższą potrawę");
            System.out.println("2. Znajdź wszystkie ostre potrawy");
            System.out.println("3. Znajdź wszystkie słodkie potrawy");
            System.out.println("4. Znajdź najcięższą potrawę");
            System.out.println("5. Wyjdź");

            System.out.print("Wybierz opcję: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    restaurant.displayMostExpensiveDish();
                    break;
                case 2:
                    restaurant.displayDishesByFlavor("ostry");
                    break;
                case 3:
                    restaurant.displayDishesByFlavor("słodki");
                    break;
                case 4:
                    restaurant.displayHeaviestDish();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Dziękujemy za odwiedzenie restauracji Gourmet Bistro");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
                    break;
            }
        }
    }
}
