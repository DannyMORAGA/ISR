package colas;

import javax.swing.JOptionPane;

public class MENU {
    public static String dat;
    public static COLAS b;
    
    public static void mete(){
     dat =JOptionPane.showInputDialog(null,"Ingrese una palabra : ");
     }
    
    public static void main(String args[]){ 
       String op1a, op2b;
       int op2=0,op1=0;
       
       PROCES cola=new PROCES();
       
       do{
           op1a= JOptionPane.showInputDialog(null,"BIENVENDIO ELIJA SU OPCION: \n1. Ingresar \n2. Mostrar Cola \n3. Mostrar el Dato en Cima \n4. Borrar Dato en la Cima \n5. Ver Longitud \n6.Comprobar si esta vacia  ");
           op1= Integer.parseInt(op1a);
           switch(op1){
           case 1:
               mete();
               b= new COLAS(dat);
               cola.QUEUE(b);
               break;
           case 2:
               JOptionPane.showMessageDialog(null,""+cola.Mostrarpil());
               break;
            
           case 3:
               JOptionPane.showMessageDialog(null,"Data en la Cima: "+cola.MOSTRAPRI().getDAT()); 
               break;
               
           case 4:
               JOptionPane.showMessageDialog(null,"Listo Borrado"); 
               cola.DEQUEUE();
               break;
           case 5:
               JOptionPane.showMessageDialog(null,"Longitud de la Cola: "+cola.longitud());
               break;
           case 6:
               JOptionPane.showMessageDialog(null,"Respuesta: "+cola.vacia()); 
               break;
           }
           
          
           
           
           
           op2b= JOptionPane.showInputDialog(null,"Desea regresar al menu? 1=SI 2=NO");
           op2= Integer.parseInt(op2b);
       }
       while(op2==1);
       
    }
}
