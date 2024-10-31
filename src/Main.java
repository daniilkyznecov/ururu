import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var boxWeight1 = 78.2;
        var boxWeight2 = 82.7;
        System.out.println(boxWeight2 + boxWeight1);
        System.out.println(boxWeight2 - boxWeight1);

        System.out.println("Задание 7");
        System.out.println(boxWeight2 % boxWeight1);

        System.out.println("Задание 8");
        var totalWorkTime = 640;
        var workTimeOnePeople = 8;
        var worker = totalWorkTime / workTimeOnePeople;
        System.out.println("Всего работников в компании " + worker + " человек! ");
        var workerCompany2 = worker + 94;
        System.out.println("Если в компании работает " + workerCompany2 + " человека, то всего " + (workerCompany2 * 8) + " часов работы может быть поделено между сотрудникам ");
    }
}