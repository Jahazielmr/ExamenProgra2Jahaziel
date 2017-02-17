package jahazielexamen;

public class Politico extends Personas{
    
    private String partido;

    public Politico() {
        super();
    }

    public Politico(String partido, String Nombre, String ID, String IDBoleto, String Departamento, float Dinero, int edad) {
        super(Nombre, ID, IDBoleto, Departamento, Dinero, edad);
        this.partido = partido;
    }

    

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString()+"Politico{" + "partido=" + partido + '}';
    }
       
    
    
}
