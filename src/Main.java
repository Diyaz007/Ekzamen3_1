import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //создание HashSet с названием arrays
        HashSet<Integer> arrays = new HashSet<Integer>();
        //создание временного LinkedList для сортировки с названием linkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        //создание Массива с названием arrays
        int[] numbers = new int[100];
        //Метод для заполнения массива
        FillNumbers(numbers);
        //Метод для заполнения HashSet
        FillHashSet(numbers,arrays,linkedList);

    }
    //Метод для заполнения массива
    public static void FillNumbers(int[] numbers){
        System.out.println("Заполнение массива ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i]+" ");
        }
    }
    //Метод для заполнения HashSet
    public static void FillHashSet(int[] numbers,HashSet<Integer> arrays,LinkedList<Integer> linkedList){
        //Сортируем массив в linkedList
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 == 0) {
                if(numbers[i] % 5 == 0) {
                    linkedList.addFirst(numbers[i]);
                }
                else if (numbers[i] % 2 == 0 && numbers[i] % 5 != 0) {
                    linkedList.addLast(numbers[i]);
                }}
            }
        //В HashSet под названием arrays присваиваем LinkedHasSet, в котором храниться отсортированный linkedlist
        arrays = new LinkedHashSet<>(linkedList);
        System.out.println();
        System.out.println("HashSet");
        System.out.println(arrays);
        }


    }

