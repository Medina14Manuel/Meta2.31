/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miguru;

/**
 *
 * @author Usuario
 */
public class Usuario {
    String Nombre;
    String Mail;
    String Contra;
    String Rol;
    
    
    public Usuario(String Nombre, String Mail, String Contra, String Ro){
        this.Nombre = Nombre;
        this.Mail = Mail;
        this.Contra = Contra;
        this.Rol = Rol;
    }
    
    
    public void IniciarSesion(){
        System.out.println("Bienvenido, " +Nombre);
    }
    
    public void CerrarSesion(){
        System.out.println("Hasta pronto, "+Nombre);
    }
}
