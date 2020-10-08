package homework_3.products;

public class Salad extends Product {

    public Salad(int weight) {
        super(weight);
        setCalories(543.7);
        setCaloriesFromWeight(weight);
        this.setColor("зеленый");
        this.setIsAvailableForSalad(true);
        this.setName("салат");

    }

}
