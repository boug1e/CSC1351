public class Pet implements Comparable<Pet>{
    private String name;
    private String type;
    private double price;

    public Pet(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void printPets() {
        System.out.printf("%-10s%10s%10.2f%n", name, type + ":", price);
    }

    @Override
    public int compareTo(Pet other) {
        if (type.compareTo(other.type) != 0) {
            return type.compareTo(other.type);
        }else{
            return Double.compare(price, other.price);
        }

    }
}
