package main;
import midia.*;
import funções.*;
import java.util.ArrayList;
import java.util.List;

public class principalMoovix {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao Moovix!");
        
        System.out.println("\nFilmes");
        
        filmes card = new filmes("Crepúsculo", "Drama, Fantasia, Romance", "2h 10m", 2008, "12");
        card.avalia(6.9);//avalição de tercieros
        card.avalia(5.8);//avalição de tercieros
        card.setSuaAva(2);//sua avaliação
        card.retornaMedia();//retorna a média
        
        
        card.exibeTitulo();

        
        System.out.println("\nSéries");

        series cardSeries = new series("Demolidor: Renascido", "Ação, Ficção Científica, Drama, Super Herói", 2025, 1, 6, "18");
        cardSeries.avalia(8);
        cardSeries.avalia(7.8);
        cardSeries.setSuaAva(10);
        cardSeries.retornaMedia();
        
        
        cardSeries.exibeTitulo();

        
        System.out.println("\nDocumentários");

        documentario cardDoc = new documentario("Senna: O Brasileiro, O Herói, O Campeão", "1h 46m", 2010, "Livre");
        cardDoc.avalia(8);
        cardDoc.avalia(5.5);
        cardDoc.setSuaAva(10);
        cardDoc.retornaMedia();
        

        cardDoc.exibeTitulo();

        
        System.out.println("\nAnimações");

        animacao cardAni = new animacao("Como Treinar o Seu Dragão", "Aventura, Fantasia, Comédia", "1h 38m", 2010, "Livre");
        cardAni.avalia(8);
        cardAni.avalia(10);
        cardAni.setSuaAva(10);
        cardAni.retornaMedia();
        
        cardAni.exibeTitulo();

        CatalogoDeMidia catalogo = CatalogoDeMidia.getInstance();
        catalogo.adicionarPublicacao(card);
        catalogo.adicionarPublicacao(cardSeries);


        System.out.println("\nMídias disponíveis para dowload");

      
        Qualidade filmeDownload = new Qualidade("Crepúsculo", 2008, "12", 2, 150, "HD");
        filmeDownload.avalia(5);
        filmeDownload.retornaMedia();
        

        

        Qualidade serieDownload = new Qualidade("Demolidor: Renascido", 2025, "18", 1, 300, "Full HD");
        serieDownload.avalia(8);
        serieDownload.setSuaAva(10);
        serieDownload.retornaMedia();
        

        List<Download> listaDownloads = new ArrayList<>();
        listaDownloads.add(filmeDownload);
        listaDownloads.add(serieDownload);
        
        for (Download download : listaDownloads) {
            download.exibeDowload();
            download.exibeTitulo();
            download.dowloadMidia();
        }

       
        System.out.println("\nCatalogo de Mídia");
        for (titulo t : catalogo.listarTitulos()){
            t.exibeTitulo();
        }   
       
    }


    
}