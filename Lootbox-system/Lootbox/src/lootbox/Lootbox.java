package lootbox;

import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;

public class Lootbox {

    public static int contcommon = 0;
    public static int contrare = 0;
    public static int contleg = 0;
    public static int contalphapacks=0;
    public static String random;

    public static void main(String[] args) {

        int cont;
        int op;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the program!");

        while (true) {
            System.out.println("==================");
            System.out.println("MENÚ");
            System.out.println("==================");

            System.out.println("1.- Open alpha pack");
            System.out.println("2.- Exit");
            System.out.println("3.- Stats");
            if(contalphapacks>0){
                System.out.println("Last object claimed: "+random);
            }
            System.out.println("------------------------");
            op = input.nextInt();
            if (op == 1) {
                System.out.println("================");
                System.out.println("1.-Open alpha pack");
                System.out.println("================");
                loader();
            }

            if (op == 2) {
                System.out.println("end of the software");
                break;
            }
            if (op == 3) {
                System.out.println("Stats");
                estadistica();

                System.out.println();

            }
            if (op < 1) {
                System.out.println("Invalid option");
            }
            if (op > 3) {
                System.out.println("invalid option");
            }
            

        }

    }

    public static void loader() {
        Scanner input = new Scanner(System.in);
        System.out.println("loading alpha pack");
        System.out.println("Wait please.");
        try {
            Thread.sleep(1200);

        } catch (InterruptedException ex) {

        }
        System.out.println("Wait..");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException ex) {

        }
        System.out.println("Wait...");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException ex) {
        }
        System.out.println("¡ALPHA PACK LOADED!");
        System.out.println("===================");
        String enter = input.nextLine();
        if (enter.equals("")) {
            System.out.println("¡OPENING ALPHA PACK!");
            list();

        }
        

    }

    public static void list() {

        String[] commonobject = {"Aluminio", "carton", "papel lustre"};
        String[] rareobject = {"\033[35mCobre", "\033[35mPlata", "\033[35mBronze", "\033[35mTitanio"};
        String[] legendaryobject = {"\033[33mOro", "\033[33mPlatino", "\033[33mDiamante", "\033[33mRubi"};

//        int listacomun = 60;
//        int listararo = 30;
//        int listaleg = 10;
        Random porcentaje = new Random();
        int total = porcentaje.nextInt(101);
        if (total > 0 && total <= 60) {
            System.out.println("comun");
             random= (commonobject[new Random().nextInt(commonobject.length)]);
            System.out.println(random + "*OO");
            contcommon++;
            contalphapacks++;

        }
        if (total > 60 && total <= 89) {
             random= (rareobject[new Random().nextInt(rareobject.length)]);
            System.out.println("\033[35mRaro");
            System.out.println(random + "**O");
            contrare++;
            contalphapacks++;

        }
        if (total > 89 && total <= 100) {
            System.out.println("");
            System.out.println("\033[33m¡Legendario!");
             random= (legendaryobject[new Random().nextInt(legendaryobject.length)]);
            System.out.println(random + "***");
            contleg++;
            contalphapacks++;

        }

    }

    public static void estadistica() {
        System.out.println("Alpha packs openeds: "+contalphapacks);
        System.out.println("Common objects obtained: " + contcommon);
        System.out.println("Rares objects obtained: " + contrare);
        System.out.println("Legendarys objects obtained: " + contleg);

    }

}
