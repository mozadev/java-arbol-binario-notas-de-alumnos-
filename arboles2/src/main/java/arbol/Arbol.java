package arbol;

public class Arbol {

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(int i, Object alumno) {
        Nodo n = new Nodo(i);
        n.contenido = alumno;
        
        
        
        if (raiz == null) {
            raiz = n;
        } else {
            Nodo aux = raiz;
            while (aux != null) {
                n.padre = aux;
                if (n.llave >= aux.llave) {
                    aux = aux.derecha;
                } else {
                    aux = aux.izquierda;
                }
            }
            if(n.llave< n.padre.llave){
                n.padre.izquierda=n;
            }else{
                 n.padre.derecha=n;
            }
             
        }

    }
    
    public void recorrer(Nodo n){
        if(n!=null){
            recorrer(n.derecha);
            System.out.println("notas: "+n.llave+" nombre: "+ n.contenido);
            recorrer(n.izquierda);
                    
         
            
            
        }
    }
    
    
    
    
    
    public class Nodo {

        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public Object contenido;

        public Nodo(int indice) {

            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
            contenido = null;

        }

    }

}
