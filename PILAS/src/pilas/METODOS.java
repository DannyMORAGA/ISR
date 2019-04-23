package pilas;


public class METODOS {
    private class NODO{
        public PILAS pil;
        public NODO siguiente= null;
    public NODO (PILAS pil){
    this.pil=pil;
    }
  }
    
private NODO cima=null;

private int longitud = 0;

public void PUSH (PILAS pil){
NODO nodo = new NODO(pil);
nodo.siguiente = cima;
cima = nodo;
longitud++;
}

public PILAS TOP (){   
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


}


