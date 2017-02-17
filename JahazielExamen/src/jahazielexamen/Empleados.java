package jahazielexamen;
    
public class Empleados extends Personas{
    
    private String empleo;

    public Empleados() {
        super();
    }

    public Empleados(String empleo, String Nombre, String ID, String IDBoleto, String Departamento, float Dinero, int edad) {
        super(Nombre, ID, IDBoleto, Departamento, Dinero, edad);
        this.empleo = empleo;
    }

    

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleados{" + "empleo=" + empleo + '}';
    }
    
    
    
    
    
    
    
}
