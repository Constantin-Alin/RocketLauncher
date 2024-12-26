public class Rocket {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            if (i == 5) {
                System.out.println("Thrusters starting!");
                continue;
            }
            System.out.println(i);
        }
    }
}
