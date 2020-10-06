package homework_3.products;

public class Beet extends Product {

    public Beet(int weight) {
        super(weight);
        setCalories(58.7);
        setCaloriesFromWeight(weight);
        this.setColor("фиолетовый");
        this.setIsAvailableForSalad(true);
        this.setName("свекла");

    }

}
