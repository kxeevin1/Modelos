/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testbanda;

class TestBanda {

    public static void main(String[] args) {

        Banda banda = new Banda("Banda");

        banda.invitarMusicos(5);  // invita 5 amigos aleatorios

        System.out.println("\nAFINANDO");
        banda.afinarBanda();

        System.out.println("\nTOCANDO");
        banda.tocarBanda();
    }
}
