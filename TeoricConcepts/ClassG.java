package TeoricConcepts;
//PUEDO HEREDAR TODO EL CODIGO PERMISIBLE DE VER, LO PRIVADO NO
public class ClassG extends ClassE {

    public void m1(){
        System.out.println(e);
        System.out.println(e1);
        //System.out.println(e2); ==> e2 es PRIVADO
        System.out.println(e3);
    }
    
}
