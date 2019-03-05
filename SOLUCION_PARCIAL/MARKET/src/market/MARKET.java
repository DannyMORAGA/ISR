/*
Jehu Daniel Moraga Galvez
0901-17-3945
Examen Variante A
5/3/2019 11:45 Am
*/
package market;

import java.util.Scanner;

public class MARKET {

    public static Scanner Leer= new Scanner(System.in);
    public static String Mat[][]= new String[10][4];
    public static String StrNom_Prod,  StrTot_Aso, StrPre, StrCant;
    public static int IntPrecio=0, IntCant=0 , IntTot_Aso=0, IntTot_Gen=0, IntTot_Gen1=0, IntPrecio1=0, IntCant1=0;
    
    public static void NOMBRE(){
    for(int Intcont=0; Intcont<10; Intcont++){
    System.out.println("Ingrese Nombre del producto en la posicion: ["+Intcont+"] [0]");
    Mat[Intcont][0]=Leer.next();
    }
    System.out.println();
    }
    
    public static void PRECIO(){
    for(int Intcont=0; Intcont<10; Intcont++){
    IntPrecio= (int) ((Math.random()*100)); 
    Mat[Intcont][1]= Integer.toString(IntPrecio);
    }
    System.out.println();
    }
       
    public static void CANTIDAD(){
    for(int Intcont=0; Intcont<10; Intcont++){
    IntCant= (int) ((Math.random()*10)); 
    Mat[Intcont][2]= Integer.toString(IntCant);
    }
    System.out.println();
    }
    
    public static void Total_Aso(){
    for(int Intcont=0; Intcont<10; Intcont++){
    IntPrecio1= Integer.parseInt(Mat[Intcont][1]);
    IntCant1=Integer.parseInt(Mat[Intcont][2]);
    IntTot_Aso=IntPrecio1*IntCant1;
    Mat[Intcont][3]=Integer.toString(IntTot_Aso);
    }
    }
    
    public static void MOSTRAR(){
    System.out.print("                          Nombre                          Precio                          Cantidad                          Total_Aso\n");
    
    
    for(int Intcont=0; Intcont<10; Intcont++){
        for(int Intcont2=0; Intcont2<4; Intcont2++){
            System.out.print("                          "+Mat[Intcont][Intcont2]+"\t");

        }
         System.out.println();
      }
    }
    
    public static void Tot_Gen(){
    
    for (int Intcont=0; Intcont<10; Intcont++){
    IntTot_Gen1=Integer.parseInt(Mat[Intcont][3]);
    IntTot_Gen=IntTot_Gen+IntTot_Gen1;
    }
    System.out.print("Este es el Total General de todos los productos: "+IntTot_Gen+"\n");
    }
            
    public static void main(String[] args) {
    NOMBRE();
    PRECIO();
    CANTIDAD();
    Total_Aso();
    MOSTRAR();
    Tot_Gen();
    }
    
}
