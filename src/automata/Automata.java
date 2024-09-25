/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automata;

/**
 *
 * @author GON161
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Nodo a = new Nodo();
        a.id = 1;
        a.name = "Neri";
        Nodo b = new Nodo();
        b.id = 1;
        b.name = "Neri";
        Nodo c = new Nodo();
        c.id = 1;
        c.name = "Neri";
        Nodo d = new Nodo();
        d.id = 1;
        d.name = "Neri";
        Nodo e = new Nodo();
        e.id = 1;
        e.name = "Neri";
        
        a.AgregarHijo(b);
        a.AgregarHijo(c);
        b.AgregarHijo(a);
        
        System.out.println(a.toString());
        
    }
    
}
