/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ana_fernandezed;

import java.util.Scanner;

/**
 *
 * @author DAM112
 */
public class Ana_FernandezED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int numero=0;
        System.out.println("¿Que opcion quieres realizar?");
        System.out.println("1- Cambiar de horas a segundos");
        System.out.println("2- Cambiar de kilometros a metros");
        System.out.println("3- Dividir kilometros entre 3.6");
        System.out.println("4 -Salir");
        int opcion=teclado.nextInt();
        do{
        switch (opcion){
                case 1:
                    System.out.println("introduce un numero");
                    numero=teclado.nextInt();
                        numero=numero*3600;
                break;
                case 2:
                    System.out.println("introduce un numero");
                    numero=teclado.nextInt();
                    numero=numero*1000;
                    break;
                case 3:
                    System.out.println("Introduce un numero");
                    numero=teclado.nextInt();
                    numero=(int)(numero/3.6);
                    break;
                default:
                    System.out.println("Numero incorrecto");
    }
        }
    while(numero !=4);
}
