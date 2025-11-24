/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolomainaggregazione;

/**
 *
 * @author ranasgalla.niccolo
 */
public class Brano {
    private String titolo;
    private String artista;
    private int durataSecondi;
    public Brano(String titolo, String artista, int durataSecondi){
        this.artista = artista;
        this.durataSecondi = durataSecondi;
        this.titolo = titolo;
    }
    public int getDurataSecondi(){
        return durataSecondi;
    }
}
