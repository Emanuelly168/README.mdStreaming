package midia;

public class animacao extends titulo {   
    
    private String duracaoAni;
    
    public animacao(){

    }

    public animacao(String nome, String genero, String duracaoAni, int ano, String classificacao) {
        setNome(nome);
        setAno(ano);
        setDuracaoAni(duracaoAni);
        setClassificacao(classificacao);
        
    }


    
    public void setDuracaoAni(String duracaoAni){
        this.duracaoAni = duracaoAni;
    }

    public String getDuracaoAni(){
        return this.duracaoAni;
    }

  


    @Override
    public void exibeTitulo(){
        super.exibeTitulo();

        System.out.println("Duração: " + duracaoAni );
    }

    

    
    
}
