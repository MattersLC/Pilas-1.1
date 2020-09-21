package pilas;

import java.util.Scanner;

public class pilas {
    
    public static Scanner sc = new Scanner (System.in);
    public static int tope=0, opc, tam=26, test;
    public static char pilas[] = new char[tam];
    public static char delete, add;
    
    // Métodos
    public static void isEmpty() {
        if (tope <= 0) {
            System.out.println("\nLa pila está vacía...");
        } else if (tope == tam) {
            System.out.println("\nLa pila está llena...\n");
        }
    }
    
    public static void menu() {
        System.out.println("*************** M E N Ú ***************");
        System.out.print("1 - Llenar pila.\n"
                       + "2 - Mostrar pila.\n"
                       + "3 - Eliminar elementos de la pila.\n"
                       + "4 - Agregar elementos en la pila.\n"
                       + "5 - Salir.\n"
                       + "Tu respuesta: ");
        opc = sc.nextInt();
    }
    
    public static void llenar() {
        System.out.println("Llenando pila...");
        for (char i=0; i<pilas.length; i++) {
            tope = i;
            pilas[tope] = (char) ('A'+i);
        }
        System.out.println("\nPila llena!\n");
    } 
    
    public static void mostrar() {
        System.out.println("\nMostrando pila:\n");
        isEmpty();
        for (int i=0; i<=tope; i++) {
            System.out.print(pilas[i]+" ");
        }
        System.out.println("\n");
    }
    
    public static void eliminar() {
        System.out.println("¿A partir de que letra te gustaría eliminar?");
        delete = sc.next().charAt(0);
        delete = Character.toUpperCase(delete);
        isEmpty();
        for (int i=0; i<26; i++) {
            if (pilas[i] == delete) {
                tope=i;
                System.out.println("¡Listo!");
            }
        }
        System.out.println("\n");
    }
    
    public static void agregar() {
        System.out.println("¿Qué letra te gustaría agregar?");
        add = sc.next().charAt(0);
        add = Character.toUpperCase(add);
        isEmpty();
        if (tope > 0 && tope < 25) {
            tope++;    
            pilas[tope] = add;
            System.out.println("\n¡Listo!\n");
        } else {
            System.out.println("\nLa pila está llena...\n");
        }
    }
    
    // Main
    public static void main(String[] args) {
        
        do {
            menu();
            switch(opc) {
                case 1: // Llenar o restaurar
                    llenar();
                break;
                case 2: // Mostrar
                    mostrar();
                break;
                case 3: // Eliminar
                    eliminar();
                break;
                case 4: // Agregar
                    agregar();
                break;
                case 5:
                break;
                default:
                    System.out.println("No introduciste una opción válida...");
                break;
            }
        }while(opc != 5);
    }
}
