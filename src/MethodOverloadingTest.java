public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading methodOverloading= new MethodOverloading();
        methodOverloading.sum();
        methodOverloading.sum(10, 290);
        methodOverloading.sum(10, 10.30f, 10);
        methodOverloading.sum(10, 10.40f);
    }


}
