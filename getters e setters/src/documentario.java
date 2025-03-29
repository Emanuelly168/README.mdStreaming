public class documentario {

    private String nomeDoc;
    private String duracaoDoc;
    private int anoDoc;
    private String faixaEtariaDoc;
    private int avalicaoDoc;
    public int suaNotaDoc;


    public void setNomeDoc(String nomeDoc){
        this.nomeDoc = nomeDoc;
    }

    public String getNomeDoc(){
        return this.nomeDoc;
    }
    
    public void setDuracaoDoc(String duracaoDoc){
        this.duracaoDoc = duracaoDoc;
    }

    public String getDuracaoDoc(){
        return this.duracaoDoc;
    }

    public void setAnoDoc(int anoDoc){
        this.anoDoc = anoDoc;
    }

    public int getAnoDoc(){
        return this.anoDoc;
    }

    public void setFaixaEtariaDoc(String faixaEtariaDoc){
        this.faixaEtariaDoc = faixaEtariaDoc;
    }

    public String getFaixaEtariaDoc(){
        return this.faixaEtariaDoc;
    }

    public void setAvalicaoDoc(int avalicaoDoc){
        this.avalicaoDoc = avalicaoDoc;
    }

    public int getAvaliacaoDoc(){
        return this.avalicaoDoc;
    }

    public int getSuaNotaDoc(){
        return this.suaNotaDoc;
    }

    public void setSuaNotaDoc(int suaNotaDoc){
        this.suaNotaDoc = suaNotaDoc;
    }



    void exibeDoc(){
        System.out.println("Nome do Documentário: " + nomeDoc);
        System.out.println("Duração do documentário: " + duracaoDoc);
        System.out.println("Ano de lançamento: " + anoDoc);
        System.out.println("Classisficação Indicada: " + faixaEtariaDoc);
        System.out.println("Avaliação: " + avalicaoDoc);
        System.out.println("Sua avaliação: " + suaNotaDoc);
    }


}


