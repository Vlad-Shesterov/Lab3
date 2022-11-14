package Lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название дня недели");
      String day = scanner.nextLine();

     switch (day){
        case "Понедельник":
            System.out.println("Это первый день недели");
            break;
        case "Вторник":
            System.out.println("Это второй день недели");
            break;
        case "Среда":
            System.out.println("Это третий день недели");
            break;
        case "Четверг":
            System.out.println("Это четвертый день недели");
            break;
        case "Пятница":
            System.out.println("Это пятый день недели");
            break;
        case "Суббота":
            System.out.println("Это шестой день недели");
            break;
        case "Воскресенье":
            System.out.println("Это седьмой день недели");
            break;
        default:
            System.out.println("Этот день не подходит");
    }

    }
}
