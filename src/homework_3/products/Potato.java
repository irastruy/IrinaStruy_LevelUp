package homework_3.products;

public class Potato extends Product {

    public Potato(int weight) {
        super(weight);
        setCalories(490.7);
        setCaloriesFromWeight(weight);
        this.setColor("коричневый");
        this.setIsAvailableForSalad(false);
        this.setName("картошка");
    }

}
