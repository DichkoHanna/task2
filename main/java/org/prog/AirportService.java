package org.prog;

import static java.lang.invoke.MethodHandleImpl.fillArray;

public class AirportService {
    int count = 0 ;
    public static void main(String[] args) {
        Plane planeMriya = new Plane("Mriya", 3);
        int[] planeMriyaseats = new int[3];
        planeMriyaseats[0] = 0;
        planeMriyaseats[1] = 0;
        planeMriyaseats[2] = 0;
                Plane planeBoeing = new Plane("Boeing", 4);
        int[] planeBoeingseats = new int[3];
        planeBoeingseats[0] = 0;
        planeBoeingseats[1] = 0;
        planeBoeingseats[2] = 0;
        String setPlane = " ";
        String q = " ";
        System.out.println("Вітаємо у нашому центрі поьотів");
        System.out.println("Будь ласка, оберіть ваш літак");
        Scanner keyboard = new Scanner(System.in);
        setPlane = keyboard.nextLine();
        if (setPlane.equals("Мрія")) {
            System.out.println("Ви обрали літак Мрія. Оберіть вашого пасажира");}
        if (setPlane.equals("Боїнг")) {
            System.out.println("Ви обрали літак Боїнг. Оберіть вашого пасажира");}
        String setPassenger = " ";
        setPassenger = keyboard.nextLine();
        if (setPassenger.equals("Тарас Шевченко"));{
            System.out.println("Ви обрали Тараса Шевченко. Оберіть ваше місце, одне з трьох");}
        if (setPassenger.equals("Іван Франко"));{
            System.out.println("Ви обрали Івана Франка. Оберіть ваше місце, одне з трьох");}
        if (setPassenger.equals("Леся Українка"));{
            System.out.println("Ви обрали Лесю Українку. Оберіть ваше місце, одне з трьох");}
        if (setPassenger.equals("Ольга Кобилянська"));{
            System.out.println("Ви обрали Ольгу Кобилянську. Оберіть ваше місце, одне з трьох");}

        public void fillArray (int[] planeMriyaseats) {
                for int i = 0; i++) {
                    passenger [i]=i;
                }

            ;
        }

}}



