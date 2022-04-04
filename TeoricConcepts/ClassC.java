package TeoricConcepts;

//CLASE ABSTRACTA, REUTILIZA CODIGO, SE USAN PARA AHORRAR
public abstract class ClassC {
    int x = 10;
    int sumar (int a, int b){
        return a + b;
    }
//Metodo abstracto: Define la firma (declaracion) del metodo, pero el cuerpo lo define el hijo de la clase
//La PRIMER clase hija NO ABSTRACTA DEBE implementar los metodos abstractos
    abstract int sumar (int a, int b, int c);
}
