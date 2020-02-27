/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author afernandezfontenla
 */
public class Personal {
          
    private String Telefono;
    private String Correo;

    public Personal(String Telefono, String Correo) {
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public Personal() {
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTeléfono(String Teléfono) {
        this.Telefono = Teléfono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Telefono=" + Telefono + ", Correo=" + Correo;
    }
    
}
