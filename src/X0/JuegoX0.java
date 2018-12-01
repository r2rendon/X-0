package X0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ArturoRendon
 */
public class JuegoX0 {
    
    //Atributos de la clase
    char Tablero[][] = new char[3][3];
    char J1, J2;
    private String jugadores[];
    
    File b;
    BufferedWriter bw;
    
    Random v;
    
    Scanner leer =new Scanner(System.in);
    
    //Constructor de la clase
    public JuegoX0(){
        
        this.J1 = ' ';
        
        this.J2 = ' ';
        
        // Inicializacion del tablero
        for (int i = 0; i < Tablero.length; i++) {
            
            for (int j = 0; j < Tablero.length; j++) {
                
                Tablero[i][j] = ' ';
                
            }
            
        }
        
        jugadores[0]="Jugador "+J1;
        jugadores[1]="Jugador "+J2;
        
    }
    
    //sets y gets
    public void setJ1(char J1) {
        this.J1 = J1;
    }

    public char getJ1() {
        return J1;
    }

    public void setJ2(char J2) {
        this.J2 = J2;
    }

    public char getJ2() {
        return J2;
    }
    
    // Metodos y funciones de la clase
    boolean PosVacia(int Fila, int Columna){
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                if (Tablero[i][j] == ' '){
                    
                    return true;
                    
                }
                
            }
            
        }
        
        return false;
        
    }
    
    boolean marcarJugada(int Jugador, int Fila, int Columna){
        
        if (this.PosVacia(Fila, Columna)) {
                
                for (int i = 0; i < 10; i++) {
                    
                    for (int j = 0; j < 10; j++) {
                        
                        if (Jugador == 1) {
                            
                           Tablero[i][j] = this.J1;
                           return true; 
                           
                        }else if (Jugador == 2) {
                            
                            Tablero[i][j] = this.J2;
                            return true;
                            
                        }
                         
                    }
                    
                }
                
            }
        
        return false;
        
    }
    
    void ImprimirTablero(){
        
        for (int i = 0; i < Tablero.length; i++) {
            
            for (int j = 0; j < Tablero.length; j++) {
                
                System.out.print(Tablero[i][j]);
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    void AsignarSimbolo(){
        
        System.out.println("\nSeleccione a que jugador quiere cambiarle el Simbolo:"
            + "\n1. "+jugadores[0]
    +"\n2. "+jugadores[1]);
    System.out.println("Seleccione una Opcion:");

    int opc=leer.nextInt();
    switch (opc){
        case 1:
            System.out.println("Ingrese el nuevo Simbolo:");
            char S=leer.next().charAt(0);
            if(S == J2|| S==J1){
                System.out.println("Ese nombre ya esta en uso!!!!!!");
            }else{
                System.out.println("Cambio completado");
                 J1 = S;
            }
           
            break;
        case 2:
               System.out.println("Ingrese el nuevo Simbolo:");
               char S2=leer.next().charAt(0);
            if(S2 == J2 || S2 == J1){
                System.out.println("Ese nombre ya esta en uso!!!!!!");
            }else{
                System.out.println("Cambio completado");
                 J2=S2;
            }
               
            break;
        default:
            System.out.println("Ingrese Opcion valida!!!!!!!!!!");

            break;
                
        }
        
    }
    
    public void asignarNombre(){
    System.out.println("\nSeleccione a que jugador quiere cambiarle el Nombre:"
            + "\n1. "+jugadores[0]
    +"\n2. "+jugadores[1]);
    System.out.println("Seleccione una Opcion:");
    int opc=leer.nextInt();
    switch (opc){
        case 1:
            System.out.println("Ingrese el nuevo nombre:");
            String name=leer.next();
            if(name.equals(jugadores[1])||  name.equals(jugadores[0])){
                System.out.println("Ese nombre ya esta en uso!!!!!!");
            }else{
                System.out.println("Cambio completado");
                 jugadores[0]=name;
            }
           
            break;
        case 2:
               System.out.println("Ingrese el nuevo nombre:");
               String name1=leer.next();
            if(name1.equals(jugadores[0]) || name1.equals(jugadores[1])){
                System.out.println("Ese nombre ya esta en uso!!!!!!");
            }else{
                System.out.println("Cambio completado");
                 jugadores[1]=name1;
            }
               
            break;
        default:
            System.out.println("Ingrese Opcion valida!!!!!!!!!!");
            break;
        }
    
    }
    
    public void fileSaver(String x)throws IOException{
    
    if(b.exists()){
          bw = new BufferedWriter(new FileWriter(b,true));
      bw.write("\n"+x);
    }else{
        bw = new BufferedWriter(new FileWriter(b,true));
      bw.write("\n"+x);
    }
    bw.close();
}
 public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader c = new BufferedReader(f);
        while((cadena = c.readLine())!=null) {
            System.out.println(cadena);
        }
        c.close();
    }


    
    public String escojerP(){
        return jugadores[v.nextInt(2)];
    }
    
    public boolean revisarGanador(){
        int h=0;
        int j=0;
        int h1=0,j1=0,b=0,v=0,h2=0,j2=0,h3=0,j3=0;
        int m=Tablero.length-1;
        int n=Tablero.length-1;
        
        
     try{
      
         for (int x=0; x < Tablero.length; x++) {
        h=0;
        j=0;h1=0;j1=0;h2=0;j2=0;v=0;b=0;h3=0;j3=0;
        m=Tablero.length-1;
        n=Tablero.length-1;
        
           
    for (int y=0; y < Tablero[x].length; y++) {
        if(Tablero[b][y] == (J1)){
            b++;
            h2++;
             if(h2==Tablero.length){
               return true;
           }

        }else if(Tablero[v][y] == (J2)){
            v++;
            j2++;
            if(j2==Tablero.length){
               return true;
           }
        }
        if(Tablero[m][y] == J1){
            m--;
            h3++;
             if(h3==Tablero.length){
               return true;
           }

        }else if(Tablero[n][y] == J2){
            n--;
            j3++;
            if(j3==Tablero.length){
               return true;
           }
        }
      
      
     
      if(Tablero[x][y] == J1){
         h++;
         if(h==Tablero.length){
             
             return true;
         }
      }else if(Tablero[x][y]==j2){
         j++;
         if(j==Tablero.length){
            return true; 
         }
      }
      if(Tablero[y][x]==J1){
          h1++;
          if(h1==Tablero.length){
            return true; 
         }
          
      }else if(Tablero[y][x]==J2){
         j1++;
         if(j1==Tablero.length){
            return true; 
         }
         
      }

           
  }
  
            
}
     }catch(Exception e){
         System.out.println("error: "+e);
     }
    return false;    
    }
    public void jugar(){
        Scanner leer=new Scanner(System.in);
        System.out.println("El primer turno se escoje automaticamente");
        String player=escojerP();
        char turno=' ';
        boolean ganador=false;
        boolean revisar=true;
        
        
        
        if(player.equals(jugadores[0])){
            System.out.println("\nEmpieza "+player);
            turno=J1;
        }else{
            System.out.println("\nEmpieza "+player);
            turno=J2;
        }
        do{
        if(turno==J1){
            
            System.out.println("Turno de "+jugadores[0]);
            System.out.println("Escoja la fila: ");
            int q=leer.nextInt();
            System.out.println("Escoja la Columna: ");
            int w=leer.nextInt();
            revisar=marcarJugada(1,q,w);
            if(revisar==true){
            Tablero[q][w]=J1;
            ImprimirTablero();
            ganador=revisarGanador();
            turno=J2;
            if(ganador==true){
            try{  
                String b="El ganador de la partida fue: "+ jugadores[0];
            System.out.println("Gano "+J1);
            fileSaver(b);
              }catch(IOException e){
                  System.out.println(e.getMessage());
              }
        
            }
            }else{
                System.out.println("Espacio Ocupado!!!");
        }
            
        }else if(turno==J2){
            System.out.println("Turno de "+jugadores[1]);
           System.out.println("Escoja la fila: ");
            int q=leer.nextInt();
            System.out.println("Escoja la Columna: ");
            int w=leer.nextInt();
            revisar=marcarJugada(2,q,w);
            if(revisar==true){
            Tablero[q][w]=J2;
            ImprimirTablero();
            ganador=revisarGanador();
            turno=J1;
            
            if(ganador==true){
              try{  
                String b="El ganador de la partida fue: "+ jugadores[1];
            System.out.println("Gano "+J2);
            fileSaver(b);
              }catch(IOException e){
                  System.out.println(e.getMessage());
              }
        
            }
            }else{
                System.out.println("Espacio Ocupado!!!!!");
            }
        }
        }while(ganador !=true); 
        
    }
    
    
  
}
