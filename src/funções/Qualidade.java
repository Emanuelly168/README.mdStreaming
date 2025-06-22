package funções;
public class Qualidade extends Download{
    private String qualidade;

    public Qualidade() {
    }

    public Qualidade(String qualidade) {
        this.qualidade = qualidade;
    }
    
    public Qualidade(String nome, int ano, String classificacao, int suaAva, int dowloadMb, String qualidade) {
        setNome(nome);
        setAno(ano);
        setClassificacao(classificacao);
        setSuaAva(suaAva);
        setDowloadMb(dowloadMb);
        setQualidade(qualidade);
    }
    
    public void setQualidade(String qualidade){
        this.qualidade = qualidade;
    }
    
    public String getQualidade(){
        return qualidade;
    }
    
    @Override
    public void dowloadMidia() {
        System.out.println("Qualidade: " + qualidade);
       
    }

   
}
