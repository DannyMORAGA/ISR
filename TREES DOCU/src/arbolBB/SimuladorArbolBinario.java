/*
Jehu Daniel Moraga Galve, 0901-17-3945
14/05/2019 11:15 am
Programa con formas pra poder visualizar Arboles y poder ponerlos en su forma de Postorden, Inorden y Preorden 
 */
package arbolBB;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author
 */
public class SimuladorArbolBinario {

    ArbolBB miArbol = new ArbolBB();

    public SimuladorArbolBinario() {
    }

    public boolean insertar(Integer dato) {
        return (this.miArbol.agregar(dato));
    }
    //metodos para mostrar los recorridos del arbol
    public String preOrden() {
        LinkedList it = this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }

    public String inOrden() {
        LinkedList it = this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }

    public String postOrden() {
        LinkedList it = this.miArbol.postOrden();
        return (recorrido(it, "Recorrido PostOrden"));
    }
    
    //metodo para poder mostrar el recorrido ya realizado
    private String recorrido(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }
    
    
    //Metodo para buscar dato en el nodo
    public String buscar(Integer dato) {
        boolean siEsta = this.miArbol.existe(dato);
        String r = "El dato:" + dato.toString() + "\n";
        r += siEsta ? "Si se encuentra en el arbol" : "No se encuentra en el arbol";
        return (r);
    }

    //Toma el recorrdio ya hecho para poder ser mandado.
    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }
}
