public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4 - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4 - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4 - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + boxerWeight + " кг");
        var capacityLeft = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + capacityLeft + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var capacityLeft = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + capacityLeft + " кг");
        var overload = boxer2 % boxer1;
        System.out.println("Разница между весами бойцов " + overload + " кг");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var allTime = 640;
        var oneJober = 8;
        var jober = allTime / oneJober;
        System.out.println("Всего работников в компании " + jober + " человек");
        jober = jober + 94;
        System.out.println("Стало работников в компании " + jober);
        oneJober = allTime / jober;
        System.out.println("Если в компании работает " + jober + " человек , то всего " + oneJober + " часов работы может быть поделено между сотрудниками");

    }




}