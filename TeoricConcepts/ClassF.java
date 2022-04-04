package TeoricConcepts;
//EXTENDS SE USA PARA HEREDAR CLASES
//IMPLEMENTS SE USA PARA HEREDAR INTERFACES
public class ClassF extends ClassD implements InterfaceA,InterfaceB{
    
//SOBREESCRIBO LA CLASE SUMAR DE MI CLASE PADRE DIRECTA (ClassD)
    int sumar(int a, int b, int c) {
        
//Clausula super: Llamo al metodo de mi clase padre para usar SU implementacion
        int z = super.sumar(a, b, c); 
        return a + b + c + z;
    }
//IMPLEMENTO EL METODO DE LA INTERFAZ
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d; 
    }
    public int sumar(int a,int b, int c,int d, int e){
        return -6;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
}
