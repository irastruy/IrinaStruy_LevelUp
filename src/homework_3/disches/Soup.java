package homework_3.disches;

import homework_3.products.Product;
import homework_3.actions.Cookable;

public class Soup implements Cookable {

    private Product[] setOfProducts;
    private String name;

    public Soup(Product[] setOfProducts) {
        this.setOfProducts = setOfProducts;
    }

    @Override
    public void cook() {
        System.out.println("Добавляем воду, начинаем варить супик");
        System.out.println("-------------------------------");
        for (Product p : this.setOfProducts) {
            p.setState("cooked");
            System.out.println(p.getName() + " сварена");
        }
        System.out.println("-------------------------------");
        System.out.println("Все сварено!");
    }

    public Product[] getSetsOfProducts() {
        return setOfProducts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}





