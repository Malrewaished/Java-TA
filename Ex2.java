public class Ex2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 33; i = i + 1){
            if (i % 5 == 0) {
            continue;
        }
                System.out.println("This is continue "+i);
        }
    }}