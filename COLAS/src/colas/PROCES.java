package colas;


public class PROCES {
    private class NODO{
    public COLAS cola;
    public NODO sigui;
    
    public NODO(COLAS cola){
    this.cola=cola;
    }
    
    public NODO cabeza, fin;
    
    
    
    public void QUEUE(COLAS c){
        NODO nodo = new NODO(c);
        if(cabeza ==null){ 
            cabeza= nodo;
        }
        else{
            fin.sigui=nodo;
           
        }
        fin=nodo;
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
        if(cabeza==null){
        fin=null;
        }
    
    
    }
    }    
    
    }
    
    
    
    
    }

