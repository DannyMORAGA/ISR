package hanoi;


public class PILA {
    private int contno=0;
    private HANOI cabeza;

    public int getContno() {
        return contno;
    }

    public HANOI getCabeza() {
        return cabeza;
    }
    
    public void PUSH(HANOI N){
        contno ++;
        if(cabeza==null){
         cabeza=N;
        }
        else{
        N.setDown(cabeza);
        cabeza.setUp(N);
        cabeza=N;
        }
    }
    
    public void POP(){
    if(contno > 0){
     contno--;
     cabeza=cabeza.getDown();  
    }  
    }
    
    public String Peek(){
    return cabeza.getDat();
    
    }
    
}
