/*
JEHU DANIEL MORAGA GALVEZ 0901-17-3945
22/05/2019 
Programa de arbols AVL con balanceo.
*/
package arbolBB;

/**
 *
 * @author
 */
public class Nodo {
  public int dato , fe;
  public Nodo izq,der;

    public Nodo(int dato, Nodo izq , Nodo der) {
        this.dato = dato;
        this.fe = 0;
        this.izq = izq;
        this.der = der;
    }

    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
 
}
