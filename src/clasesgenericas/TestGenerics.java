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
public class TestGenerics {

    public static void main(String[] args) {
        ClasesGenericas<Integer> objetoInt = new ClasesGenericas<>(14);
        objetoInt.obtenerTipo();
        
        ClasesGenericas<String> objetoStr = new ClasesGenericas<>("Daniel");
        objetoStr.obtenerTipo();

    }
}
