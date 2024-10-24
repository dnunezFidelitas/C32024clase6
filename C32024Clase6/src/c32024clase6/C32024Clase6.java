/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32024clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C32024Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario user1  = new Usuario();
        
        JOptionPane.showMessageDialog(null, "name : " + user1.getName());  
        
        
        user1.setName("dnunez");
        user1.setPwd("12345678");
        System.out.println("Dame el pwd " +  user1.getPwd());
        
         
        Usuario user2 = new Usuario("Pedro", "01012000");
        JOptionPane.showMessageDialog(null, "name : " + user2.getName());  
        JOptionPane.showMessageDialog(null, "name : " + user2.getPwd());  
        user2.estado=Estados.vivo;
        
        // crear una nueva clase que se llame empresa que tenga los siguientes atributos nombre,
        //codigo y razonSocial (privados) crear los seters, getter y constructores 
        
        Empresa empresa = new Empresa();
        //String a =Empresa.nombreEmpresa;
        System.out.println("Empresa.nombreEmpresa "+ Empresa.nombreEmpresa);
        
        //crear un Enum que tenga como datos si es una empresa contable, farmacia, automotriz, desarrolloSoftare
    }
    
}
