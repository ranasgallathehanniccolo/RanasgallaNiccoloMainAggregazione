/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ranasgallaniccolomainaggregazione;

/**
 *
 * @author ranasgalla.niccolo
 */
public class RanasgallaNiccoloMainAggregazione {

    /**
     * @param args the command line arguments
     */
    public class MainAggregazione {
    public static void main(String[] args) {
        Brano brano1 = new Brano("In the End", "Linkin Park", 216);
        Brano brano2 = new Brano("Fix You", "Coldplay", 294);
        Brano brano3 = new Brano("Always Summer", "Yellowcard", 188);

        Playlist miaPlaylist = new Playlist("Focus Coding", "Classe4INF");
        miaPlaylist.aggiungi(brano1);
        miaPlaylist.aggiungi(brano2);
        miaPlaylist.aggiungi(brano3);

        System.out.println(miaPlaylist); //Playlist{nome='Focus Coding', proprietario='Classe4INF', nBrani=3, durataTotaleSec=698}    
        for (Brano brano : miaPlaylist.getBrani()) {
            System.out.println(" - " + brano);
        }

        // Un brano può esistere anche senza playlist
        Brano standalone = new Brano("Stand Alone", "Indie", 200);
        System.out.println(standalone);   // Brano{titolo='Stand Alone', artista='Indie', durataSecondi=200}    
    }
}
    
}
