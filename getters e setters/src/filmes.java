public class filmes {
    
    private String nome;
    private String genero;
    private String duracao;
    private int ano;
    private String faixaEtaria;
    private int avalicao;
    public int suaNota;
    
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }
    
    public void setDuracao(String duracao){
        this.duracao = duracao;
    }

    public String getDuracao(){
        return this.duracao;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public void setFaixaEtaria(String faixaEtaria){
        this.faixaEtaria = faixaEtaria;
    }

    public String getFaixaEtaria(){
        return this.faixaEtaria;
    }

    public void setAvalicao(int avalicao){
        this.avalicao = avalicao;
    }

    public int getAvaliacao(){
        return this.avalicao;
    }

    public void setSuaNota(int suaNota){
        this.suaNota = suaNota;
    }

    public int getSuaNota(){
        return this.suaNota;
    }
    
    
    
    void exibeFilme(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração (em minutos): " + duracao);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Classisficação Indicada: " + faixaEtaria);
        System.out.println("Avaliação: " + avalicao);
        System.out.println("Sua avaliação: " + suaNota);
    }

}
