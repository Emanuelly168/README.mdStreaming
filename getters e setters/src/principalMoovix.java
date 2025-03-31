public class principalMoovix {
    public static void main(String[] args) throws Exception {

        filmes card = new filmes();
        series cardSeries = new series();
        documentario cardDoc = new documentario();
        animacao cardAni = new animacao();

        
        System.out.println("Filmes:");

        card.setNome("Crepusculo");
        card.setGenero("Drama, Fantasia, Romance");
        card.setDuracao("2h 10m");
        card.setAno(2008);
        card.setFaixaEtaria("12");
        card.setAvalicao(5);
        card.setSuaNota(2);
        //card.suaNota = 7;
        
        card.exibeFilme();

        
        System.out.println("\nSéries:");

        
        cardSeries.setNomeSerie("Demolidor: Renascido");
        cardSeries.setGeneroSerie("Ação, Ficção Científica, Drama, Super Herói");
        cardSeries.setAnoSerie(2025);
        cardSeries.setTemporada(1);
        cardSeries.setEpisodiosSerie(6);
        cardSeries.setFaixaEtariaSerie("18");
        cardSeries.setAvalicaoSerie(8);
        cardSeries.setSuanotaSerie(10);
        //cardSeries.suaNotaSerie = 6;
        
        cardSeries.exibeSerie();

        
        System.out.println("\nDocumentários:");

        
        cardDoc.setNomeDoc("Senna: O Brasileiro, O Herói, O Campeão");
        cardDoc.setDuracaoDoc("1h 46m");
        cardDoc.setAnoDoc(2010);
        cardDoc.setFaixaEtariaDoc("Livre");
        cardDoc.setAvalicaoDoc(8);
        cardDoc.setSuaNotaDoc(10);
        //cardDoc.suaNotaDoc = 4;

        cardDoc.exibeDoc();

        
        System.out.println("\nAnimações:");


        cardAni.setNomeAni("Como Treinar o Seu Dragão");
        cardAni.setDuracaoAni("1h 38m");
        cardAni.setAnoAni(2010);
        cardAni.setFaixaEtariaAni("Livre");
        cardAni.setAvalicaoAni(8);
        cardAni.setSuaNotaAni(10);
        //cardAni.suaNotaAni = 9;        

        cardAni.exibeAni();


        
    }

}