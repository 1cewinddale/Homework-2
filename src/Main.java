public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("задача 1 ");
        byte PrimeNumber = 127;
        short PrimeNumber2 = 32767;
        int PrimeNumber3 = 2147483647;
        long PrimeNumber4 =9223372036854775807l;
        float AFractionalNumber = 3.467f;
        double AFractionalNumber2 = 1.987;
        System.out.println("значение переменной PrimeNumber с типом byte равно " + PrimeNumber);
        System.out.println("значение переменной PrimeNumber2 с типом short равно " + PrimeNumber2);
        System.out.println("значение переменной PrimeNumber3 с типом int равно " + PrimeNumber3);
        System.out.println("значение переменной PrimeNumber4 с типом long равно " + PrimeNumber4);
        System.out.println("значение переменной AFractionalNumber с типом float равно " + AFractionalNumber);
        System.out.println("значение переменной AFractionalNumber2 с типом double равно " + AFractionalNumber2);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float AFractionalNumber = 27.12f;
        long PrimeNumber = 987678965549l;
        double AFrictionalNumber2 = 2.786;
        short PrimeNumber2 = 569;
        short PrimeNumber3 = -159;
        int PrimeNumber4 = 27889;
        byte PrimeNumber5 = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte LydmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short TotalPaper = 480;
        int TotalStudents = LydmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        int PaperForStudents = TotalPaper / TotalStudents;
        System.out.println("На каждого ученика расчитано " +PaperForStudents +"листов бумаги ");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte PerfomanceBottle = 16;
        byte ProductionTime = 2;
        short MinuteADay = 1440;
        short MinuteATheeDay = 4320;
        int MinuteAMonth = 43200;
        int ProducedFor20min = PerfomanceBottle / ProductionTime * 20;
        int ProducedPerDay = PerfomanceBottle / ProductionTime * MinuteADay;
        int ProducedPerThreeDay = PerfomanceBottle / ProductionTime * MinuteATheeDay;
        int ProducedAMonth = PerfomanceBottle / ProductionTime * MinuteAMonth;
        System.out.println("За 20 минут машина произвела " + ProducedFor20min+ " штук бутылок");
        System.out.println("За день  машина произвела " +ProducedPerDay+" штук бутылок");
        System.out.println("За 3 дня машина произвела " +ProducedPerThreeDay+ " штук бутылок");
        System.out.println("За месяц машина произвела " +ProducedAMonth + " штук бутылок ");
    }
}
