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
        System.out.println("На каждого ученика расчитано " +PaperForStudents +" листов бумаги ");
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
        int ProducedPerMonth = PerfomanceBottle / ProductionTime * MinuteAMonth;
        System.out.println("За 20 минут машина произвела " + ProducedFor20min+ " штук бутылок");
        System.out.println("За день  машина произвела " +ProducedPerDay+" штук бутылок");
        System.out.println("За 3 дня машина произвела " +ProducedPerThreeDay+ " штук бутылок");
        System.out.println("За месяц машина произвела " +ProducedPerMonth + " штук бутылок ");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte TotalCansOfPaint = 120;
        byte ConsumptionOfWhitePerRoom = 2;
        byte ConsumptionOfGreyPerRoom = 4;
        short ConsumptionOfCansPerRoom = (byte) (ConsumptionOfGreyPerRoom + ConsumptionOfWhitePerRoom);
        short TotalRoomsInTheSchool = (byte) (TotalCansOfPaint / ConsumptionOfCansPerRoom);
        short CansOfPaintWhite = (byte) (TotalRoomsInTheSchool * ConsumptionOfWhitePerRoom);
        short CansOfPaintGrey = (byte) (TotalRoomsInTheSchool * ConsumptionOfGreyPerRoom);
        System.out.println("В школе где " +TotalRoomsInTheSchool+ " классов нужно "+CansOfPaintWhite+" банок белой краски и " + CansOfPaintGrey + " банок коричневой краски ");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short Bananas = 5;
        short BananaWeight = (5*80);
        short Milk = 200;
        double MilkWeight = (200*1.05);
        short IceCream = 2;
        short IceCreamWeight = 2*100;
        byte Eggs = 4;
        short EggsWeight = (70*4);
        double TotalFoodWeight = (float) (BananaWeight+MilkWeight+IceCreamWeight+EggsWeight) * 0.1;
        float TotalFoodWeight2 = (float) (BananaWeight+MilkWeight+IceCreamWeight+EggsWeight) / 1000;
        System.out.println(TotalFoodWeight);
        System.out.println(TotalFoodWeight2);
    }
    public static void task7() {
        System.out.println("Задача 7");
        short WeightLoose = 7;
        double WeightLooseInGrams = (WeightLoose/0.001);
        short WeightLooseMin = 250;
        short WeghtLooseMax = 500;
        short DaysForWeightLoose250 = 7000 / 250;
        short DaysForWeightLoose500 = 7000 / 500;
        int DaysToLooseToAverage =(DaysForWeightLoose250+DaysForWeightLoose500)/2;
        System.out.println(DaysForWeightLoose250+" Дней для похудения при потере 250гр. в день");
        System.out.println(DaysForWeightLoose500+" Дней для похудения при потере 500гр. в день");
        System.out.println(DaysToLooseToAverage+" Дней для похудения в среднем");
    }
    public static void task8() {
        System.out.println("Задача 8");
        byte SalaryincreasesPrecent = 10;
        int Mari = 67760;
        int Den = 83690;
        int Kristy = 76230;
        int SalaryPerYearMari = (67760 * 12);
        int SalaryPerYearDen = (83690 * 12);
        int SalaryPerYearKristy = (76230 * 12);
        double SalaryPerMonthMari = (67760 * 0.1);
        double SalaryPerMonthDen = (83690 * 0.1);
        double SalaryPerMonthKristy = (76230 * 0.1);
        double IncreasesSalaryPerYearMari = (67760 * 12) * 0.1;
        double IncreasesSalaryPerYearDen = (83690 * 12) * 0.1;
        double IncreasesSalaryPerYearKristy = (76230 * 12) * 0.1;
        System.out.println(SalaryPerYearMari);
        System.out.println(IncreasesSalaryPerYearMari);
        System.out.println(SalaryPerMonthMari);




    }
}
