package X0;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JuegoX0 lg=new JuegoX0();
        Scanner leer=new Scanner(System.in);
        int op;
        try{
         do{   
        System.out.println("JUEGO DE \"x\" Y \"0\"" );
        System.out.println("1. Jugar"
                + "\n2 .ver partidas"
                + "\n3. Cambiar letra del Jugador"
                + "\n4. Cambiar Nombre del jugador "
        +"\n5. Salir");
        op=leer.nextInt();
        
        switch(op){
            case 1:
                
               lg.ImprimirTablero();
               lg.jugar();
               
                break;
            case 2:
                
                System.out.println("Lista de partidas: ");
                String m="Archivo.txt";
                lg.muestraContenido(m);
                
                break;
            case 3:
                
                lg.AsignarSimbolo();
                
                break;
            case 4:
                lg.asignarNombre();
                break;
                
        }
        
         }while(op !=5);
         
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}