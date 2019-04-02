package estructuralibros;

import javax.swing.JOptionPane;

/**
 *
 * @author NellyLlamileth
 */
public class INICIO {
    public static Libro libro;
    public static String Strtit1, Strcod1, Straut1;
    public static void mete(){
     Strtit1 =JOptionPane.showInputDialog(null,"Titulo del libro: ");
     Strcod1 =JOptionPane.showInputDialog(null,"Codigo : ");
     Straut1 =JOptionPane.showInputDialog(null,"Autor del Libro: ");
     }
    
    
     public static void main(String[]args){
     Lista MYL = new Lista();
     String Strtit, Strcod, Straut, Strop, Strposi, Strop2;
     int Intop, Intposi, Intop2;
     do{
     Intop= Integer.parseInt(Strop =JOptionPane.showInputDialog(null,"BIENVENIDO!!!! \nQue Opcion desea: \n1.Insertar en el principio.\n2.Insertar en posicion que desee. \n3.Insertar en el Final. \n4.Eliminar el primero. \n5.Eliminar el Ultimo. \n6.Elimnar Libro en especifico. \n7.Buscar Libro. \n8.Contar Libros existentes. \n9.Comprobar si la lista esta vacia. \n10.Mostrar."));
     
     switch(Intop){
         case 1:
             mete();
             libro = new Libro(Strtit1, Strcod1, Straut1);
             MYL.insertarPrincipio(libro);
             JOptionPane.showMessageDialog(null,"LISTO, AGREGADO");
         break;
         
         case 2 :
             Intposi= Integer.parseInt(Strposi = JOptionPane.showInputDialog(null,"En que posicion desea ingresar: "));
             mete();
             libro = new Libro(Strtit1, Strcod1, Straut1);
             MYL.insertarDespues(Intposi, libro);
             JOptionPane.showMessageDialog(null,"LISTO, AGREGADO");            
         break;
         
         case 3:
             mete();
             libro = new Libro(Strtit1, Strcod1, Straut1);
             MYL.insertarFinal(libro);
             JOptionPane.showMessageDialog(null,"LISTO, AGREGADO");          
         break;
         
         case 4:
             MYL.eliminaPrincipio();
             JOptionPane.showMessageDialog(null,"LISTO, BORRADO");
         break;
         
         case 5:
             MYL.eliminarUltimo();
             JOptionPane.showMessageDialog(null,"LISTO, BORRADO");
         break;
         
         case 6:
            Intposi= Integer.parseInt(Strposi = JOptionPane.showInputDialog(null,"POsicion del libro que desee borrar: "));
            MYL.eliminarLibro(Intposi);
            JOptionPane.showMessageDialog(null,"LISTO, BORRADO");
    
         break;
         
         case 7:
             Intposi= Integer.parseInt(Strposi = JOptionPane.showInputDialog(null,"En que posicion esta el libro que busca:  "));
             System.out.println(""+MYL.obtener(Intposi));
            
         break;
         
         case 8 : 
            System.out.println(""+MYL.contar());
            
             break;
         
         case 9 :
            System.out.println(""+MYL.estaVacia());
         
         break;
         
         case 10:
            System.out.println(""+MYL.MostrarLis());
          
     }
     Intop2= Integer.parseInt(Strop2 = JOptionPane.showInputDialog(null,"Desea regresar al Menu 1=Si 2=No"));
     }
     while(Intop2!=2);
     }
     
}
