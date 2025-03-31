public class series {
    
    private String nomeSerie;
    private String generoSerie;
    private int episodiosSerie;
    private int temporada;
    private int anoSerie;
    private String faixaEtariaSerie;
    private int avalicaoSerie;
    public int suaNotaSerie;


    public void setNomeSerie(String nomeSerie){
        this.nomeSerie = nomeSerie;
    }

    public String getNomeSerie(){
        return this.nomeSerie;
    }
    
    public void setGeneroSerie(String generoSerie){
        this.generoSerie = generoSerie;
    }

    public String getGeneroSerie(){
        return this.generoSerie;
    }
    
    public void setEpisodiosSerie(int episodiosSerie){
        this.episodiosSerie = episodiosSerie;
    }

    public int getEpisodiosSerie(){
        return this.episodiosSerie;
    }

    public void setTemporada(int temporada){
        this.temporada = temporada;
    }

    public int getTemporada(){
        return this.temporada;
    }

    public void setAnoSerie(int anoSerie){
        this.anoSerie = anoSerie;
    }

    public int getAnoSerie(){
        return this.anoSerie;
    }

    public void setFaixaEtariaSerie(String faixaEtariaSerie){
        this.faixaEtariaSerie = faixaEtariaSerie;
    }

    public String getFaixaEtariaSerie(){
        return this.faixaEtariaSerie;
    }

    public void setAvalicaoSerie(int avalicaoSerie){
        this.avalicaoSerie = avalicaoSerie;
    }

    public int getAvaliacaoSerie(){
        return this.avalicaoSerie;
    }

    public int getSuaNotaSerie(){
        return this.suaNotaSerie;
    }

    public void setSuanotaSerie(int suaNotaSerie){
        this.suaNotaSerie = suaNotaSerie;
    }



    void exibeSerie(){
        System.out.println("Nome do Serie: " + nomeSerie);
        System.out.println("Gênero: " + generoSerie);
        System.out.println("Temporadas: " + temporada);
        System.out.println("Episódios: " + episodiosSerie);
        System.out.println("Ano de lançamento: " + anoSerie);
        System.out.println("Classisficação Indicada: " + faixaEtariaSerie);
        System.out.println("Avaliação: " + avalicaoSerie);
        System.out.println("Sua avaliação: " + suaNotaSerie);
    }


}
