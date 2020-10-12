package homework_4.task_2;


import java.util.*;

public class Collections {

    public static void main(String[] args) {
        Collections newApp = new Collections();
        newApp.startMethod();
    }

    private void startMethod() {
        ArrayList<Integer> list = generateNumbers();
        makeRandomOrder(list);
        findDivider(list);
        if (isUnic(list)) System.out.println("\nКоллекция уникальна");
        else System.out.println("\nКоллекция не уникальна");

    }

    private ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayNumbers.add(i);
        }
        return arrayNumbers;
    }

    // организация произвольного порядка
    private ArrayList<Integer> makeRandomOrder(ArrayList<Integer> arrayList) {
        Set<Integer> setForRandomElements = copyArrayToSet(arrayList);
        return new ArrayList<>(setForRandomElements);
    }

    private Set<Integer> copyArrayToSet(ArrayList<Integer> arrayList) {
        Set<Integer> setForRandomElements = new HashSet<>();
        setForRandomElements.addAll(arrayList);
        return setForRandomElements;
    }

    private boolean isUnic(ArrayList<Integer> arrayList) {
        Set<Integer> setForRandomElements = copyArrayToSet(arrayList);
        return setForRandomElements.size() == arrayList.size();
    }

    // проверка деления на 2,3,5,7
    private void findDivider(ArrayList<Integer> arrayList) {
        Map<Integer, List<Integer>> hashMapDivider = new HashMap<>();
        List<Integer> listDividers2 = new ArrayList<>();
        List<Integer> listDividers3 = new ArrayList<>();
        List<Integer> listDividers5 = new ArrayList<>();
        List<Integer> listDividers7 = new ArrayList<>();

        for (Integer el : arrayList) {
            if (el % 2 == 0) {
                listDividers2.add(el);
                hashMapDivider.put(2, listDividers2);
            } else if (el % 3 == 0) {
                listDividers3.add(el);
                hashMapDivider.put(3, listDividers3);
            } else if (el % 5 == 0) {
                listDividers5.add(el);
                hashMapDivider.put(5, listDividers5);
            } else if (el % 7 == 0) {
                listDividers7.add(el);
                hashMapDivider.put(7, listDividers7);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : hashMapDivider.entrySet()) {
            List<Integer> listValues = entry.getValue();
            String key = entry.getKey().toString();
            System.out.println("\nДелители " + key + ":");
            for (Integer el: listValues) {
                System.out.print(el + ", ");
            }
        }

    }
}


