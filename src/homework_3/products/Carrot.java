package homework_3.products;

public class Carrot extends Product {

    public Carrot(int weight) {
        super(weight);
        setCalories(345.7);
        setCaloriesFromWeight(weight);
        this.setColor("оранжевый");
        this.setIsAvailableForSalad(true);
        this.setName("морковь");

    }

}
