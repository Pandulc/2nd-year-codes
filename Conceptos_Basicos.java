import java.util.*;


class Student implements Comparable<Student>{ 
    
    //atributos
    private int id;
    private String name;
    private String origin;
    private int year;

    //constructor
    public Student(int id, String name, String origin, int year){
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.year = year;
    }
    
    
    //setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    
    public void setYear(int year){
        this.year = year;
    }
    
    //getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getOrigin(){
        return origin;
    }

    public int getYear(){
        return year;
    }

    @Override
    public int compareTo(Student s){
        if(this.year != s.getYear()){
            return this.year - s.getYear();
        }
        return this.name.compareTo(s.getName());
    }

}

class Main{
    public static void main(String[] args){
    int option;
    Student[] university = new Student[4];
    university[0] = new Student(1,"Matias", "Ghana",3);
    university[1] = new Student(2,"Raviol","Tucuman",1);
    university[2] = new Student(3,"Simon", "Bolivia",2);
    university[3] = new Student(4,"Gabriel", "Irak", 5);


    do{
        option = menu();
        switch(option){
            case 0:
                break;
            case 1:
                show(university);
                break;
            case 2:
                university = sort(university);
                show(university);
                break;
            case 3:
                searchLegacy(university);
                break;
            case 4:
                searchName(university);
                break;
            default:
                System.out.println("La opcion ingresada no es valida");
                break;
            }
    }while(option != 0);

}

    public static int menu(){
        
        int op = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("\nIngrese una opcion");
        System.out.println("1. Mostrar lista de alumnos");
        System.out.println("2. Ordenar por año de cursado");
        System.out.println("3. Buscar por legajo");
        System.out.println("4. Buscar por nombre");
        System.out.println("0. Salir");
        op = console.nextInt();
        return op;
        }

    public static void show(Student[] student){
        System.out.println("Listado de alumnos");
        System.out.println("Leg. \tNombre \t\t Origen \t\t Anio de cursado ");
        for(int i = 0; i < student.length; i++){
            System.out.print(student[i].getId() + "\t" + student[i].getName() + "\t\t\t" + student[i].getOrigin() + "\t\t\t"  + student[i].getYear() + "\n");
        }
    }
    // public static Student[] order(Student[] student){
    //     return student;
    // }
   
    public static void searchLegacy (Student[] student){
        int leg;
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el numero de legajo a buscar");
        leg = console.nextInt();
        for(int i = 0; i < student.length;i++){
            if(student[i].getId() == leg){
                System.out.println("Leg. \t Nombre \t\t\t Origen \t Anio de cursado ");
                System.out.print(student[i].getId() + "\t" + student[i].getName() + "\t\t\t" + student[i].getOrigin() + "\t\t\t"  + student[i].getYear() + "\n");
                break;
            }
            if(i == (student.length-1) && student[i].getId() != leg){
                System.out.println("El legajo ingresado no fue encontrado");
            }
        }
    }
    
    public static void searchName (Student[] student){
        String nam;
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a buscar (Apellido y Nombre)");
        nam = console.nextLine();
        for(int i = 0; i < student.length;i++){
            if(student[i].getName().equalsIgnoreCase(nam)){
                System.out.println("Leg. \t Nombre \t\t\t Origen \t Anio de cursado ");
                System.out.print(student[i].getId() + "\t" + student[i].getName() + "\t\t\t" + student[i].getOrigin() + "\t\t\t"  + student[i].getYear() + "\n");
                break;
            }
            if(i == (student.length-1) && !student[i].getName().equalsIgnoreCase(nam)){
                System.out.println("El nombre ingresado no fue encontrado");
            }
        }
    }

    public static Student[] sort(Student[] std){
        Arrays.sort(std);
        return std;
    }
}
