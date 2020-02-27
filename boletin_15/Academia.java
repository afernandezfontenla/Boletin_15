/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_15;

import personal.Personal;

/**
 *
 * @author afernandezfontenla
 */
public class Academia {
    
    static int numR=2020;
    private String nome;
    private int nota;
    Personal alum = new Personal();

    public Academia(String nome, int nota,String telefono,String correo) {
        this.nome = nome;
        this.nota = nota;
        alum.setTeléfono(telefono);
        alum.setCorreo(correo);
        numR++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Personal getAlum() {
        return alum;
    }

    public void setAlum(Personal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota + ", referencia=" + numR + alum.toString();
    }
    
}
