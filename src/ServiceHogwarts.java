public class ServiceHogwarts {
    public static void printStudent(Grifindor x) {
        System.out.println("Студент " + x.getName() + " обладает следующими характеристиками:" +
                "\nсила магии: " + x.getPower() +
                "\nдальность трансгрессии: " + x.getTransgressive() +
                "\nблагородство: " + x.getNobility() +
                "\nчесть: " + x.getHonor() +
                "\nхрабрость: " + x.getCourage());
    }
    public static void printStudent(Slizerine x) {
        System.out.println("Студент " + x.getName() + " обладает следующими характеристиками:" +
                "\nсила магии: " + x.getPower() +
                "\nдальность трансгрессии: " + x.getTransgressive() +
                "\nхитрость: " + x.getCunning() +
                "\nрешительность: " + x.getDetermination() +
                "\nамбициозность: " + x.getAmbition() +
                "\nнаходчивость: " + x.getResourcefulness() +
                "\nжажда власти: " + x.getThirstForPower());
    }

    public static void printStudent(Kogtevran x) {
        System.out.println("Студент " + x.getName() + " обладает следующими характеристиками:" +
                "\nсила магии: " + x.getPower() +
                "\nдальность трансгрессии: " + x.getTransgressive() +
                "\nум: " + x.getSmart() +
                "\nмудрость: " + x.getWisdom() +
                "\nостроумие: " + x.getWit() +
                "\nтворчество: " + x.getCreativity());
    }

    public static void printStudent(Puffenduy x) {
        System.out.println("Студент " + x.getName() + " обладает следующими характеристиками:" +
                "\nсила магии: " + x.getPower() +
                "\nдальность трансгрессии: " + x.getTransgressive() +
                "\nтрудолюбие: " + x.getDiligence() +
                "\nверность: " + x.getLoyalty() +
                "\nчестность: " + x.getHonesty());
    }

    public static void compareGrifindor(Grifindor x, Grifindor y) {
        int sumX = x.getNobility() + x.getHonor() + x.getCourage();
        int sumY = y.getNobility() + y.getHonor() + y.getCourage();

        if (sumX > sumY) {
            System.out.println(x.getName() + " с количеством баллов " + sumX +
                    " лучший Грифиндорец чем " + y.getName() + " с количеством баллов " + sumY);
        } else {
            System.out.println(y.getName() + " с количеством баллов " + sumY +
                    " лучший Грифиндорец чем " + x.getName() + " с количеством баллов " + sumX);
        }
    }

    public static void compareSlizerine(Slizerine x, Slizerine y) {
        int sumX = x.getCunning() + x.getDetermination() + x.getAmbition()
                + x.getResourcefulness() + x.getThirstForPower();
        int sumY = y.getCunning() + y.getDetermination() + y.getAmbition()
                + y.getResourcefulness() + y.getThirstForPower();

        if (sumX > sumY) {
            System.out.println(x.getName() + " с количеством баллов " + sumX +
                    " лучший Слизеринец чем " + y.getName() + " с количеством баллов " + sumY);
        } else {
            System.out.println(y.getName() + " с количеством баллов " + sumY +
                    " лучший Слизеринец чем " + x.getName() + " с количеством баллов " + sumX);
        }
    }

    public static void compareKogtevran(Kogtevran x, Kogtevran y) {
        int sumX = x.getSmart() + x.getWisdom() + x.getWit()
                + x.getCreativity();
        int sumY = y.getSmart() + y.getWisdom() + y.getWit()
                + y.getCreativity();

        if (sumX > sumY) {
            System.out.println(x.getName() + " с количеством баллов " + sumX +
                    " лучший Когтерванец чем " + y.getName() + " с количеством баллов " + sumY);
        } else {
            System.out.println(y.getName() + " с количеством баллов " + sumY +
                    " лучший Когтерванец чем " + x.getName() + " с количеством баллов " + sumX);
        }
    }

    public static void comparePuffenduy(Puffenduy x, Puffenduy y) {
        int sumX = x.getDiligence() + x.getLoyalty() + x.getHonesty();
        int sumY = y.getDiligence() + y.getLoyalty() + y.getHonesty();

        if (sumX > sumY) {
            System.out.println(x.getName() + " с количеством баллов " + sumX +
                    " лучший Пуфендуец чем " + y.getName() + " с количеством баллов " + sumY);
        } else {
            System.out.println(y.getName() + " с количеством баллов " + sumY +
                    " лучший Пуфендуец чем " + x.getName() + " с количеством баллов " + sumX);
        }
    }

    public static void compareStudentsPower(Hogwarts x, Hogwarts y) {
        int sumX = x.getPower() + x.getTransgressive();
        int sumY = y.getPower() + y.getTransgressive();

        if (sumX > sumY) {
            System.out.println(x.getName() + " c мощностью магии " + x.getPower() +
                    " с силой трансгрессии " + x.getTransgressive() + " с количеством баллов " + sumX +
                    " сильее чем " + y.getName() + " c мощностью магии " + y.getPower() +
                    " с силой трансгрессии " + y.getTransgressive() +  " с количеством баллов " + sumY);
        } else {
            System.out.println(y.getName() + " c мощностью магии " + y.getPower() +
                    " с силой трансгрессии " + y.getTransgressive() + " с количеством баллов " + sumY +
                    " сильее чем " + x.getName() + " c мощностью магии " + x.getPower() +
                    " с силой трансгрессии " + x.getTransgressive() +  " с количеством баллов " + sumX);
        }
    }
}
