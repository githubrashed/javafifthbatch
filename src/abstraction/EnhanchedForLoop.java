package abstraction;

import java.util.ArrayList;

public class EnhanchedForLoop {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        for (Object name : arrayList) {
            System.out.println(name);
        }
    }
}
