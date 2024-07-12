import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Character[] charDizi={'H', 'E', 'L', 'L', 'O'};
        String[] stringDizi={"Ayse", "Merve", "Selin"};
        Integer[] integerDizi={1, 2, 3, 4, 5, 6};

        YazdirGenericClass genericClass=new YazdirGenericClass();
        genericClass.yazdir(charDizi);
        genericClass.yazdir(stringDizi);
        genericClass.yazdir(integerDizi);

        System.out.println("**************************************");

        //Intiger dizisindeki cift sayilar
        Arrays.stream(integerDizi).filter(number -> (number%2==0))
                .forEach(number ->{
                    System.out.println("Cift sayilar : " + number);
                });

        System.out.println("****************************************");

        //Intiger dizisindeki tek sayilar icin -1 degeri verildi
        Arrays.stream(integerDizi).filter(number -> (number%2!=0))
                .forEach(number ->{
                    System.out.println( number + " : -1" );
                });

        }

}