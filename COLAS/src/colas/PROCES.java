package colas;


public class PROCES {


    private class NODO{
    public COLAS cola;
    public NODO sigui;
    
    public NODO(COLAS cola){
    this.cola=cola;
    }
    }
    public NODO cabeza, fin;
    private int longitud = 0;
    
    
    public void QUEUE(COLAS b){
        NODO nodo = new NODO(b);
        if(cabeza ==null){ 
            cabeza= nodo;
        }
        else{
            fin.sigui=nodo;
           
        }
        fin=nodo;
        longitud++;
    }
    
    public COLAS MOSTRAPRI(){
        if(cabeza==null){
        return null;
        }
        else{
        return cabeza.cola;
        }
    }
    
    
    public void DEQUEUE(){
    if(cabeza!=null){
        NODO eli= cabeza;
        cabeza=cabeza.sigui;
        eli.sigui=null;
        longitud--;
        if(cabeza==null){
        fin=null;
        
        }
    }
    
    }    
    
    public int longitud(){
    return longitud;
}
    
    public String Mostrarpil(){//Se hace una variable string la cual tendra los datos de libro, entonces con un ciclo se estara tomando todos los datos contendidos en las vatiables de codigo, titulo y auotr y se mostraran hasta que la direccion de un nodo inexistente.
        String StrDat=" ";
        NODO Ndcom= cabeza;
        while(Ndcom!=null){
        StrDat+="\n DATO: "+Ndcom.cola.getDAT()+"\n";
        Ndcom=Ndcom.sigui;
        }
        return(StrDat);
        }
    
    public boolean vacia(){
    return longitud==0;
}
    }
    
    
    
    
    

