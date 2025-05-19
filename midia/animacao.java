package midia;

public class animacao extends titulo {   
    
    private String duracaoAni;


    
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
