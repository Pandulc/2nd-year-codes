package TeoricConcepts;
//ClassD va a heredar TODO el codigo de ClassC
public class ClassD extends ClassC {


//SOBREESCRIBIR: REDEFINO COMO VA A OPERAR EL METODO DE LA CLASE PADRE EN LA CLASE HIJA
    int sumar (int a, int b){
        return a + b + 2; 
    }

//Implementacion del metodo abstracto    
    int sumar(int a, int b, int c) {
        return 1;
    }

//En teoria de objetos, todo esto se conoce como POLIMORFISMO (en distintas clases, el mismo metodo opera de distintas maneras)
    
}
