import java.util.ArrayList;
import java.util.List;

public class principalMoovix {
    public static void main(String[] args) throws Exception {

        filmes card = new filmes();
        series cardSeries = new series();
        documentario cardDoc = new documentario();
        animacao cardAni = new animacao();
        
        

        
        System.out.println("Filmes:");

        card.setNome("Crepusculo");
        card.setGeneroFilme("Drama, Fantasia, Romance");
        card.setDuracaoFilme("2h 10m");
        card.setAno(2008);
        card.setClassificacao("12");
        card.setAva(5);
        card.setSuaAva(2);
        
        card.exibeTitulo();

        
        System.out.println("\nSéries:");

        
        cardSeries.setNome("Demolidor: Renascido");
        cardSeries.setGeneroSerie("Ação, Ficção Científica, Drama, Super Herói");
        cardSeries.setAno(2025);
        cardSeries.setTemporada(1);
        cardSeries.setEpisodiosSerie(6);
        cardSeries.setClassificacao("18");
        cardSeries.setAva(8);
        cardSeries.setSuaAva(10);
        
        cardSeries.exibeTitulo();

        
        System.out.println("\nDocumentários:");

        
        cardDoc.setNome("Senna: O Brasileiro, O Herói, O Campeão");
        cardDoc.setDuracaoDoc("1h 46m");
        cardDoc.setAno(2010);
        cardDoc.setClassificacao("Livre");
        cardDoc.setAva(8);
        cardDoc.setSuaAva(10);

        cardDoc.exibeTitulo();

        
        System.out.println("\nAnimações:");


        cardAni.setNome("Como Treinar o Seu Dragão");
        cardAni.setDuracaoAni("1h 38m");
        cardAni.setAno(2010);
        cardAni.setClassificacao("Livre");
        cardAni.setAva(8);
        cardAni.setSuaAva(10);

        cardAni.exibeTitulo();


        System.out.println("\nMídias disponíveis para dowload:");

      
        Qualidade filmeDownload = new Qualidade();
        filmeDownload.setNome("Crepúsculo");
        filmeDownload.setAno(2008);
        filmeDownload.setClassificacao("12");
        filmeDownload.setAva(5);
        filmeDownload.setSuaAva(2);
        filmeDownload.setDowloadMb(150);
        filmeDownload.setQualidade("HD\r\n");

        

        Qualidade serieDownload = new Qualidade();
        serieDownload.setNome("Demolidor: Renascido");
        serieDownload.setAno(2025);
        serieDownload.setClassificacao("18");
        serieDownload.setAva(8);
        serieDownload.setSuaAva(10);
        serieDownload.setDowloadMb(300); 
        serieDownload.setQualidade("Full HD");

        
        List<Dowload> listaDownloads = new ArrayList<>();
        listaDownloads.add(filmeDownload);
        listaDownloads.add(serieDownload);

        
        for (Dowload download : listaDownloads) {
            download.exibeDowload();
            download.exibeTitulo();
            download.dowloadMidia();
        }

        
        
    }

}