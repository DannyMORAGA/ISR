package proyec_pila;

import javax.swing.JOptionPane;

public class START {
    public static String DATO;
    public static PROYEC_PILA a;
     public static void mete(){
     DATO =JOptionPane.showInputDialog(null,"Ingrese una palabra : ");
     }
    public static void main(String args[]){
       String op1a, op2b;
       int op2=0,op1=0;
       
       METO pil= new METO();
       do{
           
           op1a= JOptionPane.showInputDialog(null,"BIENVENDIO ELIJA SU OPCION: \n1. Ingresar \n2. Mostrar Pila \n3. Mostrar el Dato en Cima \n4. Borrar Dato en la Cima \n5. Ver Longitud \n6.Comprobar si esta vacia  ");
           op1= Integer.parseInt(op1a);
           switch(op1){ 
               case 1:
                   mete();
                   a= new PROYEC_PILA(DATO);
                   pil.PUSH(a);
               break;
               case 2: 
                   JOptionPane.showMessageDialog(null,""+pil.Mostrarpil());
               break;
               case 3:
                   JOptionPane.showMessageDialog(null,"Data en la Cima: "+pil.TOP().getPil()); 
               break;
               case 4:
                   pil.POP(); 
               break;
               case 5:
                    JOptionPane.showMessageDialog(null,"Longitud de la pila: "+pil.longitud()); 
               break;
               case 6:
                    JOptionPane.showMessageDialog(null,"Respuesta: "+pil.vacia()); 
                    
           }
           op2b= JOptionPane.showInputDialog(null,"Desea regresar al menu? 1=SI 2=NO");
           op2= Integer.parseInt(op2b);
       }
       while(op2==1);

      
       
       }
    
     
    }
    
   

