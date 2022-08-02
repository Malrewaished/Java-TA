public class Ex4 {
    public static void main(String[] args) {

        String[] array = {"Saleh", "Khaled", "Majed", "Ahmad", "Meshal", "Ahmad", "Arwa", "Yousef", "Amer", "Ali"};
        array[0]="Saleh";
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0)=='A') {
                continue;
            }
                System.out.println(array[i]);
            }
        }
    }