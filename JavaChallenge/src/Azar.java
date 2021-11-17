import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Azar {
    public static void main(String... args) {

        ArrayList<Integer> listarandom = new ArrayList<Integer>();


        Random numerosrandom = new Random();
        int lowerbound = 1000;
        int uperbound = 9999;
        int int_random = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random);
        int int_random2 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random2);
        int int_random3 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random3);
        int int_random4 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random4);
        int int_random5 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random5);
        int int_random6 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random6);
        int int_random7 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random7);
        int int_random8 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random8);
        int int_random9 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random9);
        int int_random10 = numerosrandom.nextInt(lowerbound, uperbound);
        listarandom.add(int_random10);


        Random metodo = new Random();


        for (int i = 0; i < listarandom.size(); i++) {

            int index = metodo.nextInt(listarandom.size());

            System.out.println("Random Element is :"
                    + listarandom.get(index));
        }

        long intSum = listarandom.stream()
                .mapToLong(Integer::longValue)
                .sum();

        System.out.println("Total: " + intSum);

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Type the number you want to delete");
        int Numeli = inputDevice.nextInt();

        for (int x = 0; x < listarandom.size(); x++) {
            if (listarandom.get(x) == Numeli) {
                listarandom.remove(x);
            }
        }
        System.out.println("The list without the erased number: " + listarandom);




        }
    }

