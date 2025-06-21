package midia;

public class documentario extends titulo {

    private String duracaoDoc;

    public documentario() {
    }


    public documentario(String nome, String duracaoDoc, int ano, String classificacao) {
        setNome(nome);
        setAno(ano);
        setDuracaoDoc(duracaoDoc);
        setClassificacao(classificacao);
    }


    
    public void setDuracaoDoc(String duracaoDoc){
        this.duracaoDoc = duracaoDoc;
    }

    public String getDuracaoDoc(){
        return duracaoDoc;
    }




    @Override
    public void exibeTitulo(){
        super.exibeTitulo();

        System.out.println("Duração: " + duracaoDoc);
    }


}


