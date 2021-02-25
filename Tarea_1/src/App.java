/*Programa que registra alumnos matriculados en un Instituto por un padre(encargado) */

import java.util.Scanner;

public class App {
    public static void main( String[] arg){
        Encargado encargado = new Encargado();
        Alumno alumno = new Alumno();
        Scanner entrada = new Scanner(System.in);
        int n;
        int cont = 1;
        String enc;


        System.out.print("Numero de Identidad del Encargado: ");
        encargado.id = entrada.nextLine();
        System.out.print("Ingrese la cantidad de alumnos(as) a matricular: ");
        n = entrada.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("ALUMNO"+ cont);
            System.out.print("Ingrese el primer Nombre: ");

            alumno.nb = entrada.nextLine();
            System.out.print("Ingrese el primer Apellido: ");
            alumno.ap = entrada.nextLine();
            System.out.println("\n");
            cont++; }
        System.out.println("La cantidad de alumnos(as) matriculados es: "+n);
    }
}

class Encargado{
    String id;
}
class Alumno{
    String nb;
    String ap;
}