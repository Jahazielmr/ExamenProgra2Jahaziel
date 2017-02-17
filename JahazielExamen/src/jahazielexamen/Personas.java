package jahazielexamen;

public class Personas {
    protected String Nombre, ID, IDBoleto, Departamento;
    protected float Dinero;
    protected int edad;

    public Personas() {
    }

    public Personas(String Nombre, String ID, String IDBoleto, String Departamento, float Dinero, int edad) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.IDBoleto = IDBoleto;
        this.Departamento = Departamento;
        this.Dinero = Dinero;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDBoleto() {
        return IDBoleto;
    }

    public void setIDBoleto(String IDBoleto) {
        this.IDBoleto = IDBoleto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public float getDinero() {
        return Dinero;
    }

    public void setDinero(float Dinero) {
        this.Dinero = Dinero;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", ID=" + ID + ", IDBoleto=" + IDBoleto + ", Departamento=" + Departamento + ", Dinero=" + Dinero + '}';
    }
    
    
    
    
    
    
}
