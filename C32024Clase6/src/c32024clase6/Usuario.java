/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Usuario {
    // atributos
    private String name;
    private String pwd;
    
    //constructor
    public Usuario() {
        this.name="PorFavorCambiar";
        this.pwd="123";
    }

    public Usuario(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
    
    
    
    //metodos

    public String getPwd() {
        String result = "";
        if (pwd!=null){
            for (int i = 0; i < pwd.length(); i++) {
                result+="*";
            }
        }else
            result="No hay pwd asignado";
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        if (pwd.length()<8)
            JOptionPane.showInputDialog("Esto no es una clave valida");
        else
            this.pwd = pwd;
    }

    
    
    
}
