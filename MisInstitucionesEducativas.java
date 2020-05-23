/*
 Implemente un algoritmo que le permita ingresar por teclado:
1. El nombre de su Jardin de infantes.
2. El nombre de su Escuela.
3. El nombre de su Colegio.
4. El nombre de su universidad.
5. Ingrese el nombre de su carrera.
 */
package misinstitucioneseducativas;

/**
 *
 * @author Junior
 */
import java.util.Scanner;
public class MisInstitucionesEducativas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
          System.out.println("          UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE             ");
        System.out.println("Autor: Junior Steven Cangui Toapanta"); 
        System.out.println("NRC:7450");
        System.out.println("Fecha: 21/05/2020");
        System.out.println("Tema: Caracteristicas del software GitHub\n");
        
        System.out.println("Ingrese su Jardin de infantes:");
        String jardin=objeto.nextLine (); 
        
        System.out.println("Ingrese su Escuela:");
        String escuela=objeto.nextLine (); 

        System.out.println("Ingrese su Colegio:");
        String colegio=objeto.nextLine (); 

        System.out.println("Ingrese su Universidad:");
        String universidad=objeto.nextLine (); 

        System.out.println("Ingrese su carrera:");
        String carrera=objeto.nextLine (); 

        System.out.println("           GRACIAS POR SU ATENCION            ");
    }
    
}
