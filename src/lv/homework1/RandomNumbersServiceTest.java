package lv.homework1;

import java.util.Random;

//Ok
//Vēl ir arī obligatais mājas darbs - Aritmētiskās operācijas
public class RandomNumbersServiceTest{

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int a = randomGenerator.nextInt();

        int b = randomGenerator.nextInt();

        int c = randomGenerator.nextInt();

        System.out.println (a);

        System.out.println (b);

        System.out.println (c);

        int d = a + b + c;

        System.out.println(d);

    }

}

