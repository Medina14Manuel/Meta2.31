package miguru;

public class Empleado extends Usuario{

    public Empleado(String Nombre, String Mail, String Contra, String Ro) {
        super(Nombre, Mail, Contra, Ro);
    }
   
    void verMaterial(String titulo) {
        System.out.println("Viendo material: " + titulo);
    }

    void realizarEvaluacion(String evaluacion) {
        System.out.println("Realizando evaluación: " + evaluacion);
    }

    void consultarProgreso() {
        System.out.println("Consultando progreso");
    }
}
