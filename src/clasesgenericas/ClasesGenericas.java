/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesgenericas;

/**
 *
 * @author adseglocdom
 */
public class ClasesGenericas<T> {

    T objeto;

    public ClasesGenericas(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());

    }

}
