package homework_3.products;

public class Tomato extends Product {

    public Tomato(int weight) {
        super(weight);
        setCalories(32.78);
        setCaloriesFromWeight(weight);
        this.setColor("красный");
        this.setIsAvailableForSalad(true);
        this.setName("помидорка");
    }

}
