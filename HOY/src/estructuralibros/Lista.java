/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuralibros;

/**
 *
 * @author alumno
 */
public class Lista {
	private Nodo cabeza=null;//Se crea un nodo llamdao cabeza que sera el Head de la lista.
	private int longitud=0;//Una variable longitud que sera el tamaño de ña lista.
	private class Nodo {//Se abre la clase Nodo
		public Libro libro;//Se hara una variable tipo Libro.
		public Nodo siguiente=null;//Se Hara una variable tipo nodo llamada  siguiente.
		public Nodo(Libro libro) {//Se hace una variable Nodo que tendra adentro el contenido de la variable libro.
			this.libro=libro;
		}
	}
	public void insertarPrincipio(Libro libro) {//Se pedira de parametro la variable libro la cual tendra los datos.
		Nodo nodo=new Nodo(libro);//Se hace una variable Nodo llamada nodo que tendra la clase Nodo y pedira la variable Libro.
		nodo.siguiente=cabeza;//La variable siguiente se vuelve cabeza de la lista.
		cabeza=nodo;// Y cabeza tendra lo del nodo.
		longitud++;// Se incrementa una posicion ya que ya hay un nodo.
	}
	public void insertarFinal(Libro libro) {//Se pedira de parametro la variable libro la cual tendra los datos.
		Nodo nodo=new Nodo(libro);////Crea un nuevo nodo de tipo Nodo
		if (cabeza==null) {//Revisa se cabeza esta vacia.
			cabeza=nodo;//Entonces cabeza sera igual a Nodo.
		} else {
			Nodo puntero=cabeza;//Ya que si la cabeza tiene informacion hace que una variable nodo, puntero sea igual a cabeza, entonces el puntero sera puntero tendra la direccion del puntero siguiente, si puntero en direccion siguiente llega a ser nulo termina el ciclo.
			while (puntero.siguiente!=null) {
				puntero=puntero.siguiente;
			}
			puntero.siguiente=nodo;//Ya habiendo terminado la que el punter siguiente es nulo, entonces en esa direccion coloca nodo.
		}
		longitud++;// Se incrementa una posicion ya que ya hay un nuevo nodo.
	}
	public void insertarDespues(int n, Libro libro) {//Tiene de parametros pedir un int que sera la posicion del nodo y la variable libro.
		Nodo nodo=new Nodo(libro);//Nodo tendra la variable libro que tiene los datos para el nodo.
		if (cabeza==null) {//Verifica si la lista no esta vacia.
			cabeza=nodo;
		} else {
			Nodo puntero=cabeza;//Ya que si la cabeza tiene informacion hace que una variable nodo, puntero sea igual a cabeza, entonces el puntero sera puntero tendra la direccion del puntero siguiente, si puntero en direccion siguiente llega a ser nulo termina el ciclo.
			int contador=0;//Tendra un contador el cual determinara la posicion de direccion que ira sumando en el ciclo hasta llegar a n.
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			nodo.siguiente=puntero.siguiente;//Los datos del nodo estaran ela direccion de siguiente
			puntero.siguiente=nodo;//La direccion del nodo sera siguiente.
		}
		longitud++;// Se incrementa una posicion ya que ya hay un nuevo nodo.
	}
	public String obtener(int n) {
            String StrDat=" ";//Se crea un string para poder guardar los datos del nodo que se desea buscar.
		if (cabeza==null) {//Verifica si la lista no esta vacia.
			return null;
		} else {
			Nodo puntero=cabeza;//Ya que si la cabeza tiene informacion hace que una variable nodo, puntero sea igual a cabeza, entonces el puntero sera puntero tendra la direccion del puntero siguiente, si puntero en direccion siguiente llega a ser nulo termina el ciclo.
			int contador=0;//Tendra un contador el cual determinara la posicion de direccion que ira sumando en el ciclo hasta llegar a n.
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			if (contador!=n) {//Dice que si aun la posicion no es encontrada retorna nulo.
				return null;
			} else {//Dice que si la posicion se encontro, devolvera los datos de ese libro.
                            StrDat+="\nAutor: "+puntero.libro.getIsbn()+ "\nTitulo: "+puntero.libro.getTitulo()+"\nCodigo: "+puntero.libro.getAutor()+"\n";
				return StrDat;
			}
		}
	}
	public int contar() {//Devuelve la variable longitud que tiene el tamaño de la lista.
		return longitud;
	}
        public boolean estaVacia() {//Devuelve null si la lista esta vacia.
            return cabeza==null;
        }
        public void eliminaPrincipio() {//Dice que si la lista no esta vacia, entonces la variable primer estara en la direccion de cabeza, cabeza se hara null sus datos y se restara en la longitud.
            if (cabeza!=null){
                Nodo primer = cabeza;
                cabeza=cabeza.siguiente=null;
                longitud--;
            }
        }
        public void eliminarUltimo() {//Dice que si la lista no esta vacia, entonces hara que si cabeza en direccion siguiente es null, los datos de cabeza seran null y se resta longitud.
            if (cabeza!= null) {
                if (cabeza.siguiente==null) {
                    cabeza=null;  
                    longitud--;
                } else {//Pero si cabeza si es null entonces el puntero sera en la posicion cabeza y habra un ciclo que terminara cuando la direccion del puntero sea difernete a null, el ciclo hara puntero en la direccion siguiente.
                    Nodo puntero=cabeza;
                    while (puntero.siguiente.siguiente!=null) {                    
                        puntero=puntero.siguiente;
                    }
                    puntero.siguiente=null;//Se hace el puntero en la direrecion siguiente nulo y se resta a longitud.
                    longitud--;
                }
            }
        }
        public void eliminarLibro(int n) {//Se pedira un int que sera la posicion del nodo.
            if (cabeza!=null){//Verifica si la cabeza esta vacia.
                if (n==0){//si la posicion es 0 se borrara los datos de cabeza y se resta a longitud.
                    Nodo primer=cabeza;
                    cabeza=cabeza.siguiente;
                    primer.siguiente=null;
                    longitud--;
                } else if (n<longitud) {//si la posicion es distinta a 0  se borrara los datos de la poscion que se desa buscandola con un puntero..
                    Nodo puntero=cabeza;
                    int contador=0;
                    while (contador<(n-1)){
                        puntero=puntero.siguiente;
                        contador++;
                    }
                    Nodo temp=puntero.siguiente;
                    puntero.siguiente=temp.siguiente;
                    temp.siguiente=null;
                    longitud--;//Se resta a longitud.
                }
            }
        }
        
        public String MostrarLis(){//Se hace una variable string la cual tendra los datos de libro, entonces con un ciclo se estara tomando todos los datos contendidos en las vatiables de codigo, titulo y auotr y se mostraran hasta que la direccion de un nodo inexistente.
        String StrDat=" ";
        Nodo Ndcom= cabeza;
        System.out.print("Nueva Actualizacion: ");
        while(Ndcom!=null){
        StrDat+="\nAutor: "+Ndcom.libro.getIsbn()+ "\nTitulo: "+Ndcom.libro.getTitulo()+"\nCodigo: "+Ndcom.libro.getAutor()+"\n";
        Ndcom=Ndcom.siguiente;
        }
        return(StrDat);
        }       
}
