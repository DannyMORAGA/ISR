package proyec_pila;


public class METO {

   
     private class NODO{
        public PROYEC_PILA pil;
        public NODO siguiente= null;
    public NODO (PROYEC_PILA pil){
    this.pil=pil;
    }
  }
    
private NODO cima=null;

private int longitud = 0;

public void PUSH (PROYEC_PILA pil){
NODO nodo = new NODO(pil);
nodo.siguiente = cima;
cima = nodo;
longitud++;
}

public PROYEC_PILA TOP (){   
    if(cima==null){
    return null;
    }
    else{
    return cima.pil;
    }
}
   
public void POP(){
    if(cima!=null){
    NODO eli =cima;
    cima = cima.siguiente;
    eli.siguiente=null;
    longitud--;
    }
    
}

public int longitud(){
return longitud;
}
   
public boolean vacia(){
return longitud==0;
}

public String Mostrarpil(){//Se hace una variable string la cual tendra los datos de libro, entonces con un ciclo se estara tomando todos los datos contendidos en las vatiables de codigo, titulo y auotr y se mostraran hasta que la direccion de un nodo inexistente.
        String StrDat=" ";
        NODO Ndcom= cima;
        while(Ndcom!=null){
        StrDat+="\n DATO: "+Ndcom.pil.getPil()+"\n";
        Ndcom=Ndcom.siguiente;
        }
        return(StrDat);
        }       
}
