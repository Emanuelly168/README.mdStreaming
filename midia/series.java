package midia;
public class series extends titulo {
    
    private String generoSerie;
    private int episodiosSerie;
    private int temporada;

    public series() {
        
    }

    public series(String nome, String generoSerie, int episodiosSerie, int temporada, int ano, String classificacao) {
        setNome(nome);
        setAno(ano);
        setGeneroSerie(generoSerie);
        setEpisodiosSerie(episodiosSerie);
        setTemporada(temporada);
        setClassificacao(classificacao);
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

   


    @Override
   public void exibeTitulo(){
    super.exibeTitulo();

    System.out.println("Gênero: " + generoSerie);
    System.out.println("Temporada: " + temporada);
    System.out.println("Episódios: " + episodiosSerie);
   }

   
    


    }
