package homework_3.products;

abstract public class Product {

    // калории на 100 грамм
    private double calories;
    private double summaryCalories;
    private String color;
    private boolean isAvailableForSalad;
    private String name;
    // вес в граммах
    private int weight;
    private String state;

    public Product(int weight) {
        this.weight = weight;
        this.state = "raw";
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setCaloriesFromWeight(int weight) {
        this.summaryCalories = this.weight / 100 * calories;
    }

    public void cut() {
        System.out.println("Вы порезали " + this.color + " " + this.name);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsAvailableForSalad() {
        return this.isAvailableForSalad;
    }

    public void setIsAvailableForSalad(boolean isAvailableForSalad) {
        this.isAvailableForSalad = isAvailableForSalad;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getSummaryCalories() {
        return this.summaryCalories;
    }


}
