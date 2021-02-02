package shop;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	    // Шивачите работят едновременно и всеки от тях взима една дреха от общото
        // количество на дрехите, които трябва да се ушият, ушива я и взима следваща дреха. Процесът продължава до ушиване на
        // последната дреха. Всеки от шивачите шие в отделна нишка . Да се покаже кой от шивачите по колко дрехи е ушил.

        Tailor tailor1 = new Tailor("Ivanka");
        Tailor tailor2 = new Tailor("Penka");

        Studio studio = new Studio("Colors", 16);
        studio.add(tailor1);
        studio.add(tailor2);


        System.out.println("Threads started!");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
