public class Dish {
    private String name;
    private double price;
    private double weight;
    private String flavor;

    public Dish(String name, double price, double weight, String flavor) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getFlavor() {
        return flavor;
    }
}

