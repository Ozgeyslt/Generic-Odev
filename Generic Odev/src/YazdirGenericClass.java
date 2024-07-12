public class YazdirGenericClass {

    public static <T> void yazdir(T[] dizi){
        for (T e: dizi){
            System.out.println(e);
        }
    }
}
