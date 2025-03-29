public class animacao {
    
    private String nomeAni;
    private String duracaoAni;
    private int anoAni;
    private String faixaEtariaAni;
    private int avalicaoAni;
    public int suaNotaAni;


    public void setNomeAni(String nomeAni){
        this.nomeAni = nomeAni;
    }

    public String getNomeAni(){
        return this.nomeAni;
    }
    
    public void setDuracaoAni(String duracaoAni){
        this.duracaoAni = duracaoAni;
    }

    public String getDuracaoAni(){
        return this.duracaoAni;
    }

    public void setAnoAni(int anoAni){
        this.anoAni = anoAni;
    }

    public int getAnoAni(){
        return this.anoAni;
    }

    public void setFaixaEtariaAni(String faixaEtariaAni){
        this.faixaEtariaAni = faixaEtariaAni;
    }

    public String getFaixaEtariaAni(){
        return this.faixaEtariaAni;
    }

    public void setAvalicaoAni(int avalicaoAni){
        this.avalicaoAni = avalicaoAni;
    }

    public int getAvaliacaoAni(){
        return this.avalicaoAni;
    }

    public int getSuaNotaAni(){
        return this.suaNotaAni;
    }

    public void setSuaNotaAni(int suaNotaAni){
        this.suaNotaAni = suaNotaAni;
    }



    void exibeAni(){
        System.out.println("Nome da Animação: " + nomeAni);
        System.out.println("Duração da Animação: " + duracaoAni);
        System.out.println("Ano de lançamento: " + anoAni);
        System.out.println("Classisficação Indicada: " + faixaEtariaAni);
        System.out.println("Avaliação: " + avalicaoAni);
        System.out.println("Sua avaliação: " + suaNotaAni);
    }
}
