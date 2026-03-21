/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbanda;

import java.util.ArrayList;
import java.util.Random;

class Banda {

    private String nombre;
    private ArrayList<Musico> integrantes;

    public Banda(String nombre) {
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    public void invitarMusicos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            integrantes.add(generarMusico());
        }
    }

    public void afinarBanda() {
        for (Musico m : integrantes) {
            m.afinar();
        }
    }

    public void tocarBanda() {
        for (Musico m : integrantes) {
            m.tocar();
        }
    }

    private Musico generarMusico() {
        Random r = new Random();

        String[] nombres = {"Kevin", "Ana", "Luis", "Sofia", "Daniel", "Paulo", "Mateo", "Lisbeth", "Andres", "Rosa"};
        String nombre = nombres[r.nextInt(nombres.length)];

        Instrumento instrumento;

        int opcion = r.nextInt(4);

        switch (opcion) {
            case 0:
                instrumento = new Guitarra();
                break;
            case 1:
                instrumento = new Piano();
                break;
            case 2:
                instrumento = new Violin();
                break;
            case 3:
                instrumento = new Bajo();
                break;
            default:
                instrumento = new Guitarra();
        }

        return new Amigo(nombre, instrumento);
    }
}