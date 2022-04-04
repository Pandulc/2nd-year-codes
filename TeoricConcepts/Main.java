package TeoricConcepts;
public class Main {
    public static void main (String[]args){
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        
//instanceof me determina si la variable es de ESE tipo de dato
        if(classA instanceof ClassA){
            System.out.println("classA es de tipo ClassA");
        }

        if(classB instanceof ClassB){
            System.out.println("classB es de tipo ClassB");
        }

//NO PODEMOS INSTANCIAR CLASES ABSTRACTAS
//ClassC classC = new ClassC(); ==> ERROR
//Sirve para concentrar codigo que sera usado por clases hijas
//Si puedo instanciar clases HIJAS de una clase abstracta 
//La ClassD es hija de ClassC por lo tanto instancio D     

        ClassD classD = new ClassD();
//Es valido declarar una variable de tipo padre instanciandola con el tipo hijo
        ClassC classD2 = new ClassD();
//El compilador solo lee Object        
        Object ClassD3 = new ClassD();
//      System.out.println(classD3.x); ==> Esto da error ya que Object oculta que ClassD3 es ClassC o ClassD
 
//Casteo ClassD3 y lo guardo en una ClassD para usar x
        ClassD classDCast = (ClassD) ClassD3;

        System.out.println(classD.x);
        System.out.println(classD2.x);
        System.out.println(classDCast.x);
        //Otra forma del casteo
        System.out.println(((ClassD)ClassD3).x);

//FORMA CORRECTA DE CASTEAR: PRIMERO ASEGURARSE DE QUE TIPO DE DATO ES (con instanceof), LUEGO CASTEAR
//PARA IMPRIMIR DATOS: PRIMERO HACER UN IF PREGUNTANDO SI ES != null
        

        if(classD instanceof ClassD){
            System.out.println("classd es de tipo ClassD");
        }
        if(classD instanceof ClassC){
            System.out.println("classd es de tipo ClassC");
        }

//Una clase no abstracta tambien puede ser heredada por otras clases no abstractas, B hereda de E       
        System.out.println(classB.e);

        // Prueba de modificadores de acceso

        ClassG classG = new ClassG();
        System.out.println(classG.e);
        System.out.println(classG.e1);
        //System.out.println(classG.e2); ==> e2 es PRIVADO
        System.out.println(classG.e3);

//NO SE PUEDE INSTANCIAR UNA INTERFAZ
//InterfaceA interfaceA = new InterfaceA(); ==> ERROR
        InterfaceA interfaceA = new ClassF();
        if(interfaceA instanceof ClassF){
            System.out.println("interfaceA es de tipo ClassF");
        }
        if(interfaceA instanceof InterfaceA){
            System.out.println("interfaceA es de tipo InterfaceA");
        }
    }
}
