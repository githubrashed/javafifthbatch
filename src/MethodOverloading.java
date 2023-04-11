public class MethodOverloading {

    int a;
    int b;

    void sum() {
        System.out.println("SLA");
    }

    void sum(int x, int y) {
        System.out.println(x + y);

    }

    void sum(int x, float y) {
        System.out.println(x + y);

    }

    void sum(int x, float y, int z) {
        System.out.println(x + y + z);

    }

}
