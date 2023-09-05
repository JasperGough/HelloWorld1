
/**
 * Write a description of class datatypes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class datatypes
{
    public static void main(String[] args)
    {
        int i = 10;
        double f = 2.5;
        boolean flag = true;
        f += i;
        flag = !flag;
        i++;
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringEquals = string1.equals(string2);
        String [] stringArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int i1 = 0; i1 > stringArray.length; i1++){
            System.out.println(i1);
        }
        for (String value : stringArray){
            System.out.println(value);
        }
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        System.out.println("Hello World!");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(stringEquals);
    }
}
