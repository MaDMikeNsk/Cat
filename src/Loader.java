import java.net.Socket;

public class Loader
{
    public static void main(String[] args)
    {
        Cat murzik = new Cat();
        Cat vaska = new Cat();
        Cat tishka = new Cat();
        Cat barsik = new Cat();
        Cat bob = new Cat();
        Cat dik = new Cat();
        Cat masya = new Cat();
        Cat black = new Cat(110.0);   //Создаём кошку с заданным весом

        System.out.println("Кошек создано: " + Cat.getCount());

        System.out.println("=============================================");
        //**********************************************************************************
        //Кормим Мурзика
        System.out.println("Вес кота Мурзика до: " + murzik.getWeight());
        for (int i=1; i<=500; i++){
            murzik.feed(8.0);
        }
        System.out.println("Вес кота Мурзика после: " + murzik.getWeight());
        System.out.println("Съедено: " + murzik.getFeedAmount() + " г");
        System.out.println("Мурзик " + murzik.getStatus());
        System.out.println("Количество кошек: " + Cat.getCount());
        System.out.println("=============================================");

        //***********************************************************************************
        //Васька 500 раз мяукает
        System.out.println("Вес кота Васьки до: " + vaska.getWeight());
        for (int i=1; i<=500; i++) {
            vaska.meow();
        }
        System.out.println("Вес кота Васьки после: " + vaska.getWeight());
        System.out.println("Васька " + vaska.getStatus());
        System.out.println("Количество кошек: " + Cat.getCount());
        System.out.println("=============================================");

        //************************************************************************************
        //Взрываем Тишку
        System.out.println("Вес кота Тишки до: " + tishka.getWeight());
        int i=0;
        while (!tishka.getStatus().equals("Exploded")) {
            tishka.feed(8.0);
            i++;
        }
        System.out.println("Количество приёмов пищи: " + i);
        System.out.println("Съедено " + tishka.getFeedAmount() + " грамм");
        System.out.println("Тишка " + tishka.getStatus());
        System.out.println("Количество кошек: " + Cat.getCount());
        System.out.println("=============================================");

        //*************************************************************************************
        //Барсик мяукает до смерти
        System.out.println("Вес кота Барсика до: " + barsik.getWeight());
        int j=0;
        while (!barsik.getStatus().equals("Dead")) {
            barsik.meow();
            j++;
        }
        System.out.println("Количество мяуканий: " + j);
        System.out.println("Барсик " + barsik.getStatus());
        System.out.println("Количество кошек: " + Cat.getCount());
        System.out.println("=============================================");
        //*************************************************************************************

        bob.goToilet();
        System.out.println("=============================================");

        System.out.println("Количество кошек: " + Cat.getCount());
//
//        System.out.println("Вес Боба: " + bob.getWeight());
//        System.out.println("Вес Дика: "+ dik.getWeight());
//        System.out.println(Cat.getWeightDifference(bob, dik));

        System.out.println("Мурзик " + murzik.getStatus());
        System.out.println("Васька " + vaska.getStatus());
        System.out.println("Тишка " + tishka.getStatus());
        System.out.println("Барсик " + barsik.getStatus());
        System.out.println("Боб " + bob.getStatus());
        System.out.println("Дик " + dik.getStatus());
        System.out.println("Мася " + masya.getStatus());
        System.out.println("Black " + black.getStatus());
        System.out.println("=============================================");
        //***************************************************************************************

        //Эксперименты с кошкой Black заданной массы
        System.out.println(black.getWeight());
        black.feed(150.0);
        System.out.println(black.getWeight());
        System.out.println(black.getStatus());
        System.out.println("Количество кошек: " + Cat.getCount());
        System.out.println("=============================================");
        //**************************************************************************


        //*****************      Клонируем кошку    **************************
        Cat blue = new Cat();
        Cat dark = Cat.cloneCat (blue);
        blue.feed(100.0);
        System.out.println(blue.getWeight());
        System.out.println(dark.getWeight());

        //***********   Создаём новую кошку со случайной массой в диапазоне (100,200) грамм    *********************
        Cat white = getNewRandomCat();
        System.out.println(white.getWeight());
        System.out.println("Количество кошек: " + Cat.getCount());
        System.out.println("=============================================");
    }

    public static Cat getNewRandomCat()       //Метод создания новой кошки со случайной массой
    {
        Double randomWeight = 100 + 100*Math.random();
        Cat cat = new Cat(randomWeight);
        return cat;
    }
}