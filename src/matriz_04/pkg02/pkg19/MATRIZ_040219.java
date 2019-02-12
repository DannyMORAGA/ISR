package matriz_04.pkg02.pkg19;

import java.text.DecimalFormat;
import java.util.Scanner;


public class MATRIZ_040219 {

   
    public static void main(String[] args) {
        Scanner Leer =new Scanner(System.in);//Declaramos un Scanner para que lea los dato.
        String StrMatriz [][];//Declaramos una Matriz tipo String.
        StrMatriz = new String[10][7];//Le damos tamaño a la matriz.
        int intSuelBas=0, intTotDedu=0, intTotPer=0, intSuelLi1=0, intSuelLi2=0, intSuelLi3=0, intSuelLi4=0, intDep=0 ;//Declaramos unas variables tipo entero para los calculos con numeros.
        String strSuelBas1, strTotDedu1, strTotPer1, strSuelLi6, strDep1, strIRS2;//Declaramos unas variables String para poder mostrar
        double  dblISR1=0, dblSuelLi4=0, dblSuelLi5=0;//Declaramos variables tipo Double para la operaciones con punto decimal.
        System.out.println("Bienvenido!!!! INGRESO DE PLANILLA\n");
        
        for(int intCont=0; intCont<10; intCont++){//Pedimos los Nombres de los empleados
          System.out.println("Ingrese un Nombre en la posicion: ["+intCont+"] [0]");
          StrMatriz[intCont][0]=Leer.next();//Se Guarda en la Matriz
        }
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera
          intSuelBas=(int)(Math.random()*99000+1000);
          strSuelBas1= Integer.toString(intSuelBas);//Se vuelve String la varible entera           
          StrMatriz[intCont][1]=strSuelBas1;//Se Guarda en la Matriz
        }
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera
          intTotDedu=(int)(Math.random()*500+300);   
          strTotDedu1= Integer.toString(intTotDedu);//Se vuelve String la varible entera   
          StrMatriz[intCont][2]=strTotDedu1;//Se Guarda en la Matriz
        }
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera    
          intTotPer=(int)(Math.random()*500+300);
          strTotPer1= Integer.toString(intTotPer);//Se vuelve String la varible entera   
          StrMatriz[intCont][3]=strTotPer1;//Se Guarda en la Matriz
        }
        
        
        for(int intCont=0; intCont<10; intCont++){//Se usara if's para poder buscar en el suedlo base conforme a los rangos para sacarle su ISR
        intSuelLi1= Integer.parseInt(StrMatriz[intCont][1]);
        if(intSuelLi1<=5000){
        dblISR1= intSuelLi1*0.3;
        }
        if(intSuelLi1>=5001&&intSuelLi1<=10000){
        dblISR1= intSuelLi1*0.5;
        }
        if(intSuelLi1>=10001&&intSuelLi1<=100000){
        dblISR1= intSuelLi1*0.10;
        }
        strIRS2= String.valueOf((String.format("%.2f", dblISR1)));//Se vuelve String la varible double y que este dando unicamente 2 decimales
        StrMatriz[intCont][4]=strIRS2;//Se Guarda en la Matriz 
        }
        
        for(int intCont=0; intCont<10; intCont++){
          intSuelLi1= Integer.parseInt(StrMatriz[intCont][1]);//Se toman los valores en dichas posiciones de la matriz para tomar su dato y convertirlo a enteros
          intSuelLi2= Integer.parseInt(StrMatriz[intCont][2]);
          intSuelLi3= Integer.parseInt(StrMatriz[intCont][3]);
          dblSuelLi4= Double.parseDouble(StrMatriz[intCont][4]);//Se toman los valores en dichas posiciones de la matriz para tomar su dato y convertirlo a double
          dblSuelLi5= intSuelLi1-intSuelLi2+intSuelLi3-dblSuelLi4;//Con los datos tomados de las posiciones anteriores se usaran para este calculo y se guarda en una variable String
          strSuelLi6= String.valueOf((String.format("%.2f", dblSuelLi5)));//Se vuelve String la varible double y que este dando unicamente 2 decimales
          StrMatriz[intCont][5]=strSuelLi6;//Se Guarda en la Matriz 
        }
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera  
          intDep=(int)(Math.random()*5+1);
          strDep1= Integer.toString(intDep);//Se vuelve String la varible entera 
          StrMatriz[intCont][6]=strDep1;//Se Guarda en la Matriz
        }
        
        System.out.println("              <Nombre>                 <Sue_Ba>                 <Tot_De>                 <Tot_Pe>                 <ISR>                           <Sue_Li>                  <Depart>");
        
        for(int intFila=0; intFila<10; intFila++){//Se muesta la Matriz
           for(int intColumna=0; intColumna<7; intColumna++){
           System.out.print("                  "+StrMatriz[intFila][intColumna]+"\t");
           }
           System.out.println();
        }
        
        int intVector[]= new int[5];//Se declara un vector tipo entero
        int intD1=0,intD2=0,intD3=0,intD4=0,intD5=0;//Se declaran varibales tipo entero como contadores para los departamentos
        for(int Cont=0; Cont<10; Cont++)//se Buscara en las posiciones de la matriz el #departamento para poder contabilizar cuantos empleados hay en cada departamento.
        {
        if(StrMatriz[Cont][6].equals("1")){
        intVector[0]=intD1=intD1+1;
        }
        if(StrMatriz[Cont][6].equals("2")){
        intVector[1]=intD2=intD2+1;
        }
        if(StrMatriz[Cont][6].equals("3")){
        intVector[2]=intD3=intD3+1;
        }
        if(StrMatriz[Cont][6].equals("4")){
        intVector[3]=intD4=intD4+1;
        }
        if(StrMatriz[Cont][6].equals("5")){
        intVector[4]=intD5=intD5+1;
        }
         }
        
        System.out.print("\n\nEmpleados en cada departamento:  \n");
        
        System.out.println("\n<<Departamento 1>>= "+intVector[0]);//Se muestran los datos de cuantos empleados hay en cada departamento.
        System.out.println("\n<<Departamento 2>>= "+intVector[1]);
        System.out.println("\n<<Departamento 3>>= "+intVector[2]);
        System.out.println("\n<<Departamento 4>>= "+intVector[3]);
        System.out.println("\n<<Departamento 5>>= "+intVector[4]);
       
    }
    
}
