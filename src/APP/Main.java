package APP;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int sumMinus=0;
        int even=0;
        int odd=0;
        int min=numbers[0];
        int max=numbers[0];
        int indexMin=0;
        int index=0;
        int indexMax=0;
        int sumAfterMinus=0;
        int countMinus=0;
        boolean found = false;
        for (int number : numbers) {
            if (number < 0) {
                sumMinus+=number;
            }

            if (number % 2 == 0){
                even++;
            } else { odd++;
            }
            if (number < min) {
                min = number;
                indexMin=index;
            }
            if (number > max){
                max=number;
                indexMax=index;
            }
            if(found){
                sumAfterMinus+=number;
                countMinus++;
            } else if (number<0){
                found = true;
            }
            index++;
        }
        System.out.println("Сума від'ємних чисел: " +sumMinus);
        System.out.println("Кількість парних чисел: " +even);
        System.out.println("Кількість непарних чисел: " +odd);
        System.out.println("Найменший елемент: " +min+ "(з індексом " +indexMin+ ")");
        System.out.println("Найбільший елемент: " +max+ "(з індексом " +indexMax+ ")");
        System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " +(countMinus > 0 ? (double) sumAfterMinus / countMinus : 0));



    }
}
