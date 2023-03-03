import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.getInstance();
        Scanner in = new Scanner(System.in);
        int N, M, f;
        ArrayList<Integer> list = new ArrayList<Integer>();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        N = in.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        M = in.nextInt();
        logger.log("Создаём и наполняем список");

        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        f = in.nextInt();
        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(f);
        list = (ArrayList<Integer>) filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + list);
        logger.log("Завершаем программу");
    }// main
}// class
