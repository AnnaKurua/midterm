package midterm.ana_kurua_2.task3;

import java.util.ArrayList;
import java.util.List;

public class PnMS {
    private List<PhoneNum> storage = new ArrayList<PhoneNum>();

    public void addNum(PhoneNum Number) {
        storage.add(Number);
    }

    public boolean removeNum(PhoneNum Number) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            PhoneNum n = storage.get(i);
            if (n.getName().equals(Number.getName()) && n.getNum().equals(Number.getNum())) {
                storage.remove(i);
                removed = true;
                break;
            }

        }
        return removed;
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("No Numbers in your storage:(");
        } else {
            for (PhoneNum n : storage) {
                System.out.println(n.getName() + ": " + n.getNum());
                System.out.println();
            }
        }
    }

}
