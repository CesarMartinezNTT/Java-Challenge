import java.util.ArrayList;

public class Capicua {

    public static void main(String[]args){
        ArrayList<Integer> listacap = new ArrayList<Integer>();
        listacap.add(101);
        listacap.add(202);
        listacap.add(121);
        listacap.add(898);

        System.out.println("La lista es" +listacap);
        System.out.println("Los elementos de " +listacap+ " son capicua? " +esCapicua(listacap));
    }
    public static boolean esCapicua(ArrayList<Integer> numero){
        String palabra = String.valueOf(numero);

        for (int i=0, j= palabra.length()-1; i<=j; i++, --j){
            if (palabra.charAt(i) !=palabra.charAt(j)){
                return true;
            }

        }
        return false;
    }
}
