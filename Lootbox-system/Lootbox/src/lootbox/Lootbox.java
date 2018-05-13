package lootbox;

import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;

public class Lootbox {

    public static int contcomun = 0;
    public static int contraro = 0;
    public static int contleg = 0;
    public static int contsobres=0;
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

            System.out.println("1.- Abrir sobre");
            System.out.println("2.- Salir");
            System.out.println("3.- Estadisticas");
            if(contsobres>0){
                System.out.println("Ultimo objeto obtenido: "+random);
            }
            System.out.println("------------------------");
            op = input.nextInt();
            if (op == 1) {
                System.out.println("================");
                System.out.println("1.-Abrir sobre");
                System.out.println("================");
                carga();
            }

            if (op == 2) {
                System.out.println("Fin del programa");
                break;
            }
            if (op == 3) {
                System.out.println("Estadisticas");
                estadistica();

                System.out.println();

            }
            if (op < 1) {
                System.out.println("Opcion no valida");
            }
            if (op > 3) {
                System.out.println("Opcion no valida");
            }
            

        }

    }

    public static void carga() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cargando sobre");
        System.out.println("Espere.");
        try {
            Thread.sleep(1200);

        } catch (InterruptedException ex) {

        }
        System.out.println("Espere..");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException ex) {

        }
        System.out.println("Espere...");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException ex) {
        }
        System.out.println("¡SOBRE CARGADO!");
        System.out.println("===================");
        String enter = input.nextLine();
        if (enter.equals("")) {
            System.out.println("¡ABRIENDO SOBRE!");
            lista();

        }
        

    }

    public static void lista() {

        String[] Objetocomun = {"Aluminio", "carton", "papel lustre"};
        String[] Objetoraro = {"\033[35mCobre", "\033[35mPlata", "\033[35mBronze", "\033[35mTitanio"};
        String[] Objetolegendario = {"\033[33mOro", "\033[33mPlatino", "\033[33mDiamante", "\033[33mRubi"};

//        int listacomun = 60;
//        int listararo = 30;
//        int listaleg = 10;
        Random porcentaje = new Random();
        int total = porcentaje.nextInt(101);
        if (total > 0 && total <= 60) {
            System.out.println("comun");
             random= (Objetocomun[new Random().nextInt(Objetocomun.length)]);
            System.out.println(random + "*OO");
            contcomun++;
            contsobres++;

        }
        if (total > 60 && total <= 89) {
             random= (Objetoraro[new Random().nextInt(Objetoraro.length)]);
            System.out.println("\033[35mRaro");
            System.out.println(random + "**O");
            contraro++;
            contsobres++;

        }
        if (total > 89 && total <= 100) {
            System.out.println("");
            System.out.println("\033[33m¡Legendario!");
             random= (Objetolegendario[new Random().nextInt(Objetolegendario.length)]);
            System.out.println(random + "***");
            contleg++;
            contsobres++;

        }

    }

    public static void estadistica() {
        System.out.println("Sobres abiertos: "+contsobres);
        System.out.println("Objetos comunes obtenidos: " + contcomun);
        System.out.println("Objetos raros obtenidos: " + contraro);
        System.out.println("Objetos legendarios obtenidos: " + contleg);

    }

}
