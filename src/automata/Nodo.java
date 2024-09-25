/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automata;

import java.util.ArrayList;

/**
 *
 * @author GON161
 */
public class Nodo {
    
    public int id = 0;
    public String name = "";
    public boolean estado = false;
    ArrayList<Nodo> hijos = null;
    ArrayList<String> estados = null;

    public Nodo() {
        hijos = new ArrayList<Nodo>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isEstado() {
        return estado;
    }

    public ArrayList<Nodo> getHijo() {
        return hijos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setHijo(ArrayList<Nodo> hijo) {
        this.hijos = hijo;
    }
    
    public void AgregarHijo(Nodo hijo){
        hijos.add(hijo);
    }
            
}
