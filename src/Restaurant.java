import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Dish> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        menu.add(dish);
    }

    public void displayMostExpensiveDish() {
        if (menu.isEmpty()) {
            System.out.println("Brak potraw w menu.");
            return;
        }

        Dish expensiveDish = menu.stream()
                .max(Comparator.comparingDouble(Dish::getPrice))
                .orElse(null);

        if (expensiveDish != null) {
            System.out.println("Najdroższa potrawa: " + expensiveDish.getName() + ", Cena: " + expensiveDish.getPrice());
        } else {
            System.out.println("Brak potraw w menu.");
        }
    }
    
    public void displayDishesByFlavor(String flavor) {
        List<Dish> dishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getFlavor().equalsIgnoreCase(flavor)) {
                dishes.add(dish);
            }
        }

        if (dishes.isEmpty()) {
            System.out.println("Brak " + flavor.toLowerCase() + " potraw w menu.");
            return;
        }

        System.out.println(flavor.substring(0, 1).toUpperCase() + flavor.substring(1).toLowerCase() + " potrawy:");
        for (Dish dish : dishes) {
            System.out.println("- " + dish.getName() + ", Cena: " + dish.getPrice());
        }
    }

    public void displayHeaviestDish() {
        if (menu.isEmpty()) {
            System.out.println("Brak potraw w menu.");
            return;
        }

        Dish heavyDish = menu.get(0);
        for (Dish dish : menu) {
            if (dish.getWeight() > heavyDish.getWeight()) {
                heavyDish = dish;
            }
        }
        System.out.println("Najcięższa potrawa: " + heavyDish.getName() + ", Waga: " + heavyDish.getWeight() + "g");
    }
}
