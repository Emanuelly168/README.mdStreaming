package main;
import midia.*;
import funções.*;
import java.util.ArrayList;
import java.util.List;

public class principalMoovix {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao Moovix!");
        
        System.out.println("\nFilmes");
        
        filmes card = new filmes();
        card.setNome("Crepusculo");
        card.setGeneroFilme("Drama, Fantasia, Romance");
        card.setDuracaoFilme("2h 10m");
        card.setAno(2008);
        card.setClassificacao("12");
        card.avalia(6.9);//avalição de tercieros
        card.avalia(5.8);//avalição de tercieros
        card.setSuaAva(2);//sua avaliação
        card.retornaMedia();//retorna a média
        
        
        card.exibeTitulo();

        
        System.out.println("\nSéries");

        series cardSeries = new series();
        cardSeries = new series();
        cardSeries.setNome("Demolidor: Renascido");
        cardSeries.setGeneroSerie("Ação, Ficção Científica, Drama, Super Herói");
        cardSeries.setAno(2025);
        cardSeries.setTemporada(1);
        cardSeries.setEpisodiosSerie(6);
        cardSeries.setClassificacao("18");
        cardSeries.avalia(8);
        cardSeries.avalia(7.8);
        cardSeries.setSuaAva(10);
        cardSeries.retornaMedia();
        
        
        cardSeries.exibeTitulo();

        
        System.out.println("\nDocumentários");

        documentario cardDoc = new documentario();
        cardDoc.setNome("Senna: O Brasileiro, O Herói, O Campeão");
        cardDoc.setDuracaoDoc("1h 46m");
        cardDoc.setAno(2010);
        cardDoc.setClassificacao("Livre");
        cardDoc.avalia(8);
        cardDoc.avalia(5.5);
        cardDoc.setSuaAva(10);
        cardDoc.retornaMedia();
        

        cardDoc.exibeTitulo();

        
        System.out.println("\nAnimações");

        animacao cardAni = new animacao();
        cardAni.setNome("Como Treinar o Seu Dragão");
        cardAni.setDuracaoAni("1h 38m");
        cardAni.setAno(2010);
        cardAni.setClassificacao("Livre");
        cardAni.avalia(8);
        cardAni.avalia(10);
        cardAni.setSuaAva(10);
        cardAni.retornaMedia();
        
        cardAni.exibeTitulo();

        CatalogoDeMidia catalogo = CatalogoDeMidia.getInstance();
        catalogo.adicionarPublicacao(card);
        catalogo.adicionarPublicacao(cardSeries);


        System.out.println("\nMídias disponíveis para dowload");

      
        Qualidade filmeDownload = new Qualidade();
        filmeDownload.setNome("Crepúsculo");
        filmeDownload.setAno(2008);
        filmeDownload.setClassificacao("12");
        filmeDownload.avalia(5);
        filmeDownload.setSuaAva(2);
        filmeDownload.setDowloadMb(150);
        filmeDownload.setQualidade("HD\r\n");
        filmeDownload.retornaMedia();
        

        

        Qualidade serieDownload = new Qualidade();
        serieDownload.setNome("Demolidor: Renascido");
        serieDownload.setAno(2025);
        serieDownload.setClassificacao("18");
        serieDownload.avalia(8);
        serieDownload.setSuaAva(10);
        serieDownload.setDowloadMb(300); 
        serieDownload.setQualidade("Full HD");
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