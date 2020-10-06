package homework_3.dinner;

import homework_3.disches.*;
import homework_3.products.*;

public class Dinner {

    public static void main(String[] args) {

        Soup borscht = new Borscht(56, 878, 23, 453);
        cookBorscht(borscht);
        calcCalories(borscht);
        fingProductsInBorshtByParameters(borscht);

        Product[] setOfProduct = new Product[] {new Potato(454),
                new Tomato(305), new Beet(678), new Carrot(332), new Salad(456)};
        sortProductsForSalad(setOfProduct);
    }

    public static void cookBorscht(Soup borscht) {
        borscht.cook();
    }

    public static void calcCalories(Soup soup) {
        Product[] productsOfSoup = soup.getSetsOfProducts();
        double summaryCalories = 0;
        for (Product p : productsOfSoup) {
            summaryCalories += p.getSummaryCalories();
        }
        System.out.println("Итоговая калорийность блюда " + soup.getName() + " равна " + summaryCalories);
    }

    public static void fingProductsInBorshtByParameters(Soup soup) {
        /*System.out.println("Изначальный набор продуктов выглядит так:");
        for (Product p: setOfProducts) {
            System.out.println(p.getName());
        }
        System.out.println("Подходящий набор для салата:");
        for (Product p: setOfProducts) {
            if (p.getState().equals("raw") && p.getIsAvailableForSalad() && (p.getColor().equals("красный") || p.getColor().equals("оранжевый") || p.getColor().equals("фиолетовый") || p.getColor().equals("зеленый"))) {
                System.out.println(p.getName());
            }
        }*/
        System.out.println("Поиск продуктов в борще, соответствующих параметрам (цвет красный, оранжевый или фиолетовый), калорийность меньше 500" );
        System.out.println("Найденные продукты:" );
        for (Product p : soup.getSetsOfProducts()) {
            if ((p.getColor().equals("красный") || p.getColor().equals("оранжевый") || p.getColor().equals("фиолетовый")) && p.getSummaryCalories() < 500) {
                System.out.println(p.getName());
            }
        }
    }

    public static void sortProductsForSalad(Product[] setOfProducts) {
        for (int i = 1; i < setOfProducts.length; i++) {
            int f = 0;
            for (int j = 0; j < setOfProducts.length - i; j++) {
                if (setOfProducts[j].getSummaryCalories() > setOfProducts[j + 1].getSummaryCalories()) {
                    Product tempElement = setOfProducts[j];
                    setOfProducts[j] = setOfProducts[j + 1];
                    setOfProducts[j + 1] = tempElement;
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }
        System.out.println("Осортированный список продуктов для салат в порядке возрастания калорийности");

        for (Product p : setOfProducts) {
            System.out.println(p.getName() + " " + p.getSummaryCalories());
        }
    }

    }
