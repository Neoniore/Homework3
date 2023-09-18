public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int intNumber = 1024;
        byte byteNumber = 127;
        short shortNumber = 28500;
        long longNumber = 5484261215L;
        float floatNumber = 0.1236845f;
        double doubleNumber = 10.65458324156498;

        System.out.println("Значение переменной intNumber с типом int равно " + intNumber + "\n" +
                "Значение переменной byteNumber с типом byte равно " + byteNumber + "\n" +
                "Значение переменной shortNumber с типом short равно " + shortNumber + "\n" +
                "Значение переменной longNumber с типом long равно " + longNumber + "\n" +
                "Значение переменной floatNumber с типом float равно " + floatNumber + "\n" +
                "Значение переменной doubleNumber с типом double равно " + doubleNumber);
        System.out.println("");

        //Задание 2
        float floatNum = 27.12f;
        long longNum = 987678965549L;
        double doubleNum = 2.786; // В условии была запятая после 2, исправил на точку
        short shortNum = 569;
        short shortNum1 = -159;
        int intNum = 27897;
        byte byteNum = 67;

        //Задание 3
        System.out.println("Задание 3");
        byte studentsInFirstClass = 23, studentsInSecondClass = 27, studentsInThirdClass = 30;
        short sheetsOfPaper = 480;
        int paperForStudent = sheetsOfPaper / (studentsInFirstClass + studentsInSecondClass + studentsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
        System.out.println("");

        //Задание 4
        System.out.println("Задание 4");
        byte perfomancePerTwoMinutes = 16;
        int perfomancePerTwentyMinutes = perfomancePerTwoMinutes * 10;
        int perfomancePerDay = perfomancePerTwentyMinutes * 3 * 24;
        int perfomancePerThreeDays = perfomancePerDay * 3;
        int perfomancePerMonth = perfomancePerThreeDays * 10;
        System.out.println("За 20 минут машина произвела " + perfomancePerTwentyMinutes + " штук бутылок \n" +
                "За сутки машина произвела " + perfomancePerDay + " штук бутылок \n" +
                "За три дня машина произвела " + perfomancePerThreeDays + " штук бутылок \n" +
                "За месяц машина произвела " + perfomancePerMonth + " штук бутылок \n");
        System.out.println("");

        //Задание 5
        System.out.println("Задание 5");
        int allCansOfPaint = 120, whiteCansForClassroom = 2, brownCansForClassroom = 4, allClassrooms, cansOfWhitePaint, cansOfBrownPaint;
        allClassrooms = (allCansOfPaint / (whiteCansForClassroom + brownCansForClassroom));
        cansOfWhitePaint = whiteCansForClassroom * allClassrooms;
        cansOfBrownPaint = brownCansForClassroom * allClassrooms;
        System.out.println("В школе, где " + allClassrooms + " классов, нужно " + cansOfWhitePaint + " банок белой краски и " + cansOfBrownPaint + " банок коричневой краски");
        System.out.println("");

        //Задание 6
        System.out.println("Задание 6");
        int weightBananaGr = 80, weightMilkGr = 105, weightIceCreamGr = 100, weightEggGr = 70, servingWeightGr;
        float servingWeightKilo;
        servingWeightGr = weightBananaGr * 5 + weightEggGr * 4 + weightMilkGr * 2 + weightIceCreamGr * 2;
        servingWeightKilo = (servingWeightGr / 1000f);
        System.out.println("Вес спортзавтрака " + servingWeightGr + " грамм или " + servingWeightKilo + " килограмм");
        System.out.println("");

       //Задание 7
        System.out.println("Задание 7");
        int needToLoseWeight = 7;
        float weightLossPerDayMin = 0.25f, weightLossPerDayMax = 0.5f, daysToLoseWeightMin, daysToLoseWeightMax, daysToLoseWeightAvg;
        daysToLoseWeightMin = needToLoseWeight / weightLossPerDayMin;
        daysToLoseWeightMax = needToLoseWeight / weightLossPerDayMax;
        daysToLoseWeightAvg = needToLoseWeight / ((weightLossPerDayMin + weightLossPerDayMax) / 2f);
        System.out.println("Если худеть по " + weightLossPerDayMin * 1000f + " грамм в день, то для похудения на 7кг потребуется " + daysToLoseWeightMin + " дней \n" +
                "Если худеть по " + weightLossPerDayMax * 1000f + " грамм в день, то для похудения на 7кг потребуется " + daysToLoseWeightMax + " дней \n" +
                "Если худеть по " + (weightLossPerDayMin + weightLossPerDayMax) / 2f + " грамм в день, то для похудения на 7кг потребуется " + daysToLoseWeightAvg + " дней");
        System.out.println("");

        //Задание 8
        System.out.println("Задание 8");
        int mashasOldSalary = 67760, denissOldSalary = 83690, cristinasOldSalary = 76230;
        float mashasNewSalary, denissNewSalary, cristinasNewSalary, mashasDiff, denissDiff, cristinasDiff;
        mashasNewSalary = mashasOldSalary + mashasOldSalary * 0.1f;
        mashasDiff = mashasNewSalary - mashasOldSalary;
        denissNewSalary = denissOldSalary + denissOldSalary * 0.1f;
        denissDiff = denissNewSalary - denissOldSalary;
        cristinasNewSalary = cristinasOldSalary + cristinasOldSalary * 0.1f;
        cristinasDiff = cristinasNewSalary - cristinasOldSalary;
        System.out.println("Маша теперь получает " + mashasNewSalary + " рублей. Годовой доход вырос на " + mashasDiff + " рублей \n" +
                "Денис теперь получает " + denissNewSalary + " рублей. Годовой доход вырос на " + denissDiff + " рублей \n" +
                "Кристина теперь получает " + cristinasNewSalary + " рублей. Годовой доход вырос на " + cristinasDiff + " рублей");
        System.out.println("");
    }
}