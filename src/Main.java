public class Main {
    public static void main(String[] args) {

        Grifindor GPotter = new Grifindor("Гарри Поттер", 20, 20, 4, 4, 5);
        Grifindor GGrandjer = new Grifindor("Гермиона Грейнджер", 39, 40, 5, 5, 6);
        Grifindor RVisly = new Grifindor("Рон Уизли", 29, 10, 3, 2, 6);

        Slizerine DMalfoy = new Slizerine("Драко Малфой", 40, 10,
                5,5,5,5,5);
        Slizerine GMontegru = new Slizerine("Грэхэм Монтегю", 27, 15,
                3,2,2,7,1);
        Slizerine GGoyil = new Slizerine("Грегори Гойл", 28, 14,
                3,3,1,4,2);

        Puffenduy ZSmith = new Puffenduy("Захария Смит", 22, 31, 4,4,4);
        Puffenduy SDigory = new Puffenduy("Седрик Диггори", 45, 45, 8,8,8);
        Puffenduy DFinch_Fichely = new Puffenduy("Джастин Финч-Флетчли", 34, 11, 5,3,1);

        Kogtevran JJang = new Kogtevran("Чжоу Чанг", 13, 15, 3, 1, 4, 2);
        Kogtevran PPatil = new Kogtevran("Падма Патил", 14, 15, 4, 2, 5, 3);
        Kogtevran MBelby = new Kogtevran("Маркус Белби", 15, 15, 5, 3, 6,4);

        ServiceHogwarts.printStudent(GPotter);
        System.out.println();
        ServiceHogwarts.printStudent(DMalfoy);
        System.out.println();
        ServiceHogwarts.printStudent(SDigory);
        System.out.println();
        ServiceHogwarts.printStudent(JJang);
        System.out.println();
        ServiceHogwarts.compareGrifindor(GPotter, GGrandjer);
        System.out.println();
        ServiceHogwarts.compareSlizerine(DMalfoy, GGoyil);
        System.out.println();
        ServiceHogwarts.compareKogtevran(JJang, PPatil);
        System.out.println();
        ServiceHogwarts.comparePuffenduy(ZSmith, SDigory);
        System.out.println();
        ServiceHogwarts.compareStudentsPower(GPotter, DMalfoy);
    }
}