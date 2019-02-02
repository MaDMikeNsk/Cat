
public class Cat
{
    private Double originWeight;
    private Double weight;
    private static int count = 0;
    private Double minWeight;
    private Double maxWeight;
    private Boolean isDead;



    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count ++;
        isDead = false;
    }

    public Cat ( Double fixedWeight)     //Кошка с заданной массой
    {
        weight = fixedWeight;
        originWeight = fixedWeight;
        isDead = false;
        count ++;
        minWeight = 50.0;
        maxWeight = 200.0;
    }

    public void meow()
    {
        weight = weight - 1;
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        String status="";
        if (isDead) {                             //Кошка уже умерла
            if (weight > maxWeight) {
                status = "Exploded";
            } else if (weight < minWeight) {
                status = "Dead";
            }
        } else {                                  //Кошка не умерла
            if (weight < minWeight) {
                count--;
                isDead = true;
                status = "Dead";
            } else if (weight > maxWeight) {
                count--;
                isDead = true;
                status = "Exploded";
            } else if (weight > originWeight) {
                status = "Sleeping";
            } else {
                status = "Playing";
            }
        }
        return status;
    }

    public Double getFeedAmount()
    {
        return weight - originWeight;
    }

    public void goToilet ()
    {
        weight = weight - 10;
        System.out.println("Кошка оправилась, вес уменьшился на 10 грамм :)");
    }

    public static int getCount ()
    {
        return count;
    }

    public static Double getWeightDifference (Cat cat1, Cat cat2)
    {
        Double difference = Math.abs (cat1.getWeight() - cat2.getWeight());
        return difference;
    }

    public static Cat cloneCat (Cat cat)      //Метод создания 'глубокой' копии кошки
    {
        Cat clone = new Cat();
        clone.weight = cat.weight;
        clone.originWeight = cat.originWeight;
        return clone;
    }
}