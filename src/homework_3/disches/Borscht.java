package homework_3.disches;

import homework_3.products.*;

public class Borscht extends Soup{

    public Borscht(int weightPotato, int weightTomato, int weightBeet, int weightCarrot) {
        super(new Product[] {new Potato(weightPotato),
                new Tomato(weightTomato), new Beet(weightBeet),
                new Carrot(weightCarrot)});
        super.setName("борщ");
    }
}
