/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbanda;

class Amigo implements Musico {

    private String nombre;
    private Instrumento instrumento;

    public Amigo(String nombre, Instrumento instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }

    public void tocar() {
        System.out.print(nombre + " -> ");
        instrumento.tocar();
    }

    public void afinar() {
        System.out.print(nombre + " -> ");
        instrumento.afinar();
    }
}