package pilas;

public class INICIO {
    public static void main(String args[]){
       PILAS a= new PILAS("Hola");
       PILAS b= new PILAS("Adios");
    
       METODOS pil= new METODOS();
       ESTAD(pil);
       pil.PUSH(a);
       ESTAD(pil);
       pil.PUSH(b);
       ESTAD(pil);
       while(!pil.vacia()){
       pil.POP();
       ESTAD(pil);
       }
    }
    
    private static void ESTAD(METODOS pil){
       if (pil.vacia()){
       System.out.println("No hay nada, Longitud=0");
       }
       else{
       System.out.println("Longitud="+pil.longitud()+" "+pil.TOP().getPil());
       }
    }

}


