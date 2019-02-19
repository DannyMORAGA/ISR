package matriz_04.pkg02.pkg19;

import java.text.DecimalFormat;
import java.util.Scanner;


public class MATRIZ_040219 {
      public static  Scanner Leer =new Scanner(System.in);//Declaramos un Scanner para que lea los dato.
      public static  String StrMatriz [][];//Declaramos una Matriz tipo String.
      public static  int intSuelBas=0, intBoni=0, intComi=0, intDesJudi=0, intSuelLi1=0, intSuelLi2=0, intSuelLi3=0, intSuelLi4=0, intDep=0, intISR=0, intIGGS=0, intIGGS2=0 ;//Declaramos unas variables tipo entero para los calculos con numeros.
      public static  String strSuelBas1, strBoni1, strComi1, strDesJudi1, strSuelLi8, strDep1, strIRS2, strIGGS2;//Declaramos unas variables String para poder mostrar
      public static  double  dblISR1=0, dblIGGS1=0,dblSuelLi4=0, dblSuelLi5=0, dblSuelLi6=0, dblSuelLi7=0 ;//Declaramos variables tipo Double para la operaciones con punto decimal.
 
     
      
    public static void MAKEMAT(){
        StrMatriz = new String[10][10];//Le damos tamaño a la matriz. 
        for(int intCont=0; intCont<10; intCont++){//Pedimos los codigos de los empleados
          System.out.println("Ingrese el codigo del Empleado en la posicion: ["+intCont+"] [0]");
          StrMatriz[intCont][0]=Leer.next();//Se Guarda en la Matriz
        }
         System.out.println("\n");
        
        for(int intCont=0; intCont<10; intCont++){//Pedimos los Nombres de los empleados
          System.out.println("Ingrese el  Nombre del Empelado  en la posicion: ["+intCont+"] [1]");
          StrMatriz[intCont][1]=Leer.next();//Se Guarda en la Matriz
        }
        
        System.out.println("\n");
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera
          intSuelBas=(int)(Math.random()*99000+1000);
          strSuelBas1= Integer.toString(intSuelBas);//Se vuelve String la varible entera           
          StrMatriz[intCont][2]=strSuelBas1;//Se Guarda en la Matriz
        }
        
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera
          intBoni=(int)(Math.random()*500+300);   
          strBoni1= Integer.toString(intBoni);//Se vuelve String la varible entera   
          StrMatriz[intCont][3]=strBoni1;//Se Guarda en la Matriz
        }
        
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera    
          intComi=(int)(Math.random()*500+300);
          strComi1= Integer.toString(intComi);//Se vuelve String la varible entera   
          StrMatriz[intCont][4]=strComi1;//Se Guarda en la Matriz
        }
        
        
        for(int intCont=0; intCont<10; intCont++){//Se usara if's para poder buscar en el suedlo base conforme a los rangos para sacarle su ISR
        System.out.println("El Empelado en la posicion: ["+intCont+"] [0], ¿Pagará IGGS?: 1=SI 0=NO");
        intIGGS= Leer.nextInt();
        
        if(intIGGS==0){
        dblIGGS1= 0;
        }
        if(intIGGS==1){
        intIGGS2=Integer.parseInt(StrMatriz[intCont][2]);
        dblIGGS1= intIGGS2*0.0483;
        }
        strIRS2= String.valueOf((String.format("%.2f", dblIGGS1)));//Se vuelve String la varible double y que este dando unicamente 2 decimales
        StrMatriz[intCont][5]=strIRS2;//Se Guarda en la Matriz 
        }
        
        
    
        for(int intCont=0; intCont<10; intCont++){//Se usara if's para poder buscar en el suedlo base conforme a los rangos para sacarle su ISR
        intISR= Integer.parseInt(StrMatriz[intCont][2]);
        if(intISR<=5000){
        dblISR1= intISR*0.3;
        }
        if(intISR>=5001&&intISR<=10000){
        dblISR1= intISR*0.5;
        }
        if(intISR>=10001&&intISR<=100000){
        dblISR1= intISR*0.10;
        }
        strIRS2= String.valueOf((String.format("%.2f", dblISR1)));//Se vuelve String la varible double y que este dando unicamente 2 decimales
        StrMatriz[intCont][6]=strIRS2;//Se Guarda en la Matriz 
        }
        
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera    
          intDesJudi=(int)(Math.random()*500+300);
          strDesJudi1= Integer.toString(intDesJudi);//Se vuelve String la varible entera   
          StrMatriz[intCont][7]=strDesJudi1;//Se Guarda en la Matriz
        }
        
        
        for(int intCont=0; intCont<10; intCont++){
          intSuelLi1= Integer.parseInt(StrMatriz[intCont][2]);//Se toman los valores en dichas posiciones de la matriz para tomar su dato y convertirlo a enteros
          intSuelLi2= Integer.parseInt(StrMatriz[intCont][3]);
          intSuelLi3= Integer.parseInt(StrMatriz[intCont][4]);
          intSuelLi4= Integer.parseInt(StrMatriz[intCont][7]);
          dblSuelLi5= Double.parseDouble(StrMatriz[intCont][5]);//Se toman los valores en dichas posiciones de la matriz para tomar su dato y convertirlo a double
          dblSuelLi6= Double.parseDouble(StrMatriz[intCont][6]);
          dblSuelLi7= intSuelLi1+intSuelLi2+intSuelLi3-intSuelLi4-dblSuelLi5-dblSuelLi6;//Con los datos tomados de las posiciones anteriores se usaran para este calculo y se guarda en una variable String
          strSuelLi8= String.valueOf((String.format("%.2f", dblSuelLi7)));//Se vuelve String la varible double y que este dando unicamente 2 decimales
          StrMatriz[intCont][8]=strSuelLi8;//Se Guarda en la Matriz 
        }
        
        for(int intCont=0; intCont<10; intCont++){//Se ingresa un numero aleatorio en la variable entera  
          intDep=(int)(Math.random()*5+1);
          strDep1= Integer.toString(intDep);//Se vuelve String la varible entera 
          StrMatriz[intCont][9]=strDep1;//Se Guarda en la Matriz
        }
       
        
        System.out.println("                           <Codigo>                         <Nombre>                         <Sue_Ba>                              <Bonificion>                      <Comision>                       <IGGS>                                     <ISR>                             <Dedu_Judi>                     <Suel_Liqui>                         <Departamento>");
        for(int intFila=0; intFila<10; intFila++){//Se muesta la Matriz
           for(int intColumna=0; intColumna<10; intColumna++){
           System.out.print("                            "+StrMatriz[intFila][intColumna]+"\t");
           }
           System.out.println();
        }
           
        int intVector[]= new int[5];//Se declara un vector tipo entero
        int intD1=0,intD2=0,intD3=0,intD4=0,intD5=0;//Se declaran varibales tipo entero como contadores para los departamentos
        for(int Cont=0; Cont<10; Cont++)//se Buscara en las posiciones de la matriz el #departamento para poder contabilizar cuantos empleados hay en cada departamento.
        {
        if(StrMatriz[Cont][9].equals("1")){
        intVector[0]=intD1=intD1+1;
        }
        if(StrMatriz[Cont][9].equals("2")){
        intVector[1]=intD2=intD2+1;
        }
        if(StrMatriz[Cont][9].equals("3")){
        intVector[2]=intD3=intD3+1;
        }
        if(StrMatriz[Cont][9].equals("4")){
        intVector[3]=intD4=intD4+1;
        }
        if(StrMatriz[Cont][9].equals("5")){
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
   
    public static void main(String[] args) {
    MAKEMAT();
    }
    
}
