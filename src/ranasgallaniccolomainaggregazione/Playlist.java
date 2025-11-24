/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolomainaggregazione;
import java.util.ArrayList;
/**
 *
 * @author ranasgalla.niccolo
 */
public class Playlist {
    private String nome;
    private String proprietario;
    private int nBrani;
    private int durataTotalesec;
    private ArrayList<Brano> brani;
    public Playlist(String nome, String proprietario){
        this.nome = nome;
        this.proprietario = proprietario;
        ArrayList<Brano> brani = new ArrayList<>();     
    }
    public void aggiungi(Brano brano){
        brani.add(brano);
    }
    public void rimuovi(Brano brano){
        brani.remove(brano);
    }
    public int sommaSec(){
        
    }
}
