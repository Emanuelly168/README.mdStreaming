package midia;

public class filmes extends titulo{
    
    private String generoFilme;
    private String duracaoFilme;

    public filmes() {
        
    }

    public filmes(String nome, String generoFilme, String duracaoFilme, int ano, String classificacao) {
        setNome(nome);
        setAno(ano);
        setGeneroFilme(generoFilme);
        setDuracaoFilme(duracaoFilme);
        setClassificacao(classificacao);
    }
   
    
    
    public void setGeneroFilme(String generoFilme){
        this.generoFilme = generoFilme;
    }

    public String getGeneroFilme(){
        return this.generoFilme;
    }
    
    public void setDuracaoFilme(String duracaoFilme){
        this.duracaoFilme = duracaoFilme;
    }

    public String getDuracaoFilme(){
        return this.duracaoFilme;
    }

    
    @Override
    public void exibeTitulo(){
        super.exibeTitulo();

        System.out.println("Genero: " + generoFilme);
        System.out.println("Duração: " + duracaoFilme);

    }

}