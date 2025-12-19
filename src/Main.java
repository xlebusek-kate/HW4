public class Main{
    public static void main(String[] args){
        // Задание номер 1
        int age = 22;
        if(age >= 18){
            System.out.println(" Если возраст человека равен " + age + " то он совершеннолетний");
        } else System.out.println(" Если возраст человека равен " + age + " то он несовершеннолетний, нужно немного подождать ");
        // Задание номер 2
        int temperature = 10;
        if (temperature < 5){
            System.out.println(" На улице" +temperature+ "градусов, нужно надеть шапку ");}
        else            System.out.println(" На улице" +temperature+ "градусов,можно идти без шапки ");
        // Задание номер 3
        int speed = 100;
        if (speed > 60)
            System.out.println(" Если скорость "+speed+ "то придется платить штраф ");
        else System.out.println(" Если скорость "+speed+ " можно ездить спокойно ");
        // Задание номер 4
        int agePeople=22;
        if (agePeople > 2 && agePeople < 6)
            System.out.println("Если возраст человека равен" +agePeople+ ", то ему нужно ходить в детский сад");
        if (agePeople > 7 && agePeople < 17)
            System.out.println("Если возраст человека равен" +agePeople+ ", то ему нужно ходить в школу");
        if (agePeople >= 18 && agePeople <= 24)
            System.out.println("Если возраст человека равен" +agePeople+ ", то ему нужно ходить в университет");
        if (agePeople > 24)
            System.out.println("Если возраст человека равен" +agePeople+ ", то ему нужно ходить на работу");
        // Задание номер 5
        int ageChildren = 10;
        if (ageChildren < 5)
            System.out.println(" Если возвраст ребенка равен " +ageChildren+ " то ему нельзя кататься на атракционе ");
        if (ageChildren > 5 && ageChildren <= 14 )
            System.out.println(" Если возвраст ребенка равен " +ageChildren+ " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        if (ageChildren > 14)
            System.out.println(" Если возвраст ребенка равен " +ageChildren+ " то он может кататься без сопровождения взрослого.");
        // Задание номер 6
        int people = 66;
        if (people < 102) {
            int seatingPosition = 20;
            if (seatingPosition < 60)
                System.out.println(" В вагоне есть сидячие место ");
            else System.out.println(" В вагоне есть стоячие место ");
        }
        else System.out.println(" Вагон уже полностью забит ");
        // Задание номер 7
        int one;
        int two;
        int three;
        if (one > two && one > three)
            System.out.println(one);
        if (two > one && two > three)
            System.out.println(two);
        if (three > one && three > two)
            System.out.println(three);
    }


}