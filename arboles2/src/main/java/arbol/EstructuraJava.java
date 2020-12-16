package arbol;

public class EstructuraJava {

    public static void main(String[] args) {
        
        Arbol arbol = new Arbol();
        
        arbol.insertar(14, " jose");
        arbol.insertar(18, " maria");
        arbol.insertar(20, " fernando");
        arbol.insertar(19, " mario");
        arbol.insertar(17, " julio");
        arbol.insertar(15, " terry");
        arbol.insertar(12, " jorge");
        arbol.insertar(13, " juan");
        arbol.insertar(10, " marcelo");
            
        
        
        arbol.recorrer(arbol.raiz);

    }

}

