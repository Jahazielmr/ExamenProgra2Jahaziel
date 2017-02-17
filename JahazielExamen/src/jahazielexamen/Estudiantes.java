package jahazielexamen;

public class Estudiantes extends Personas{
   
    private String carrera;

    public Estudiantes() {
        super();
    }

    public Estudiantes(String carrera, String Nombre, String ID, String IDBoleto, String Departamento, float Dinero, int edad) {
        super(Nombre, ID, IDBoleto, Departamento, Dinero, edad);
        this.carrera = carrera;
    }

    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiantes{" + "carrera=" + carrera + '}';
    }

        
    
    
}
