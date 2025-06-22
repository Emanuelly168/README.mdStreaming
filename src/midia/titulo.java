package midia;
import funções.Avaliacao;
public class titulo {
    
    private String nome;
    private int ano;
    private String classificacao;
    public int suaAvaliacao;

     private Avaliacao avaliacao = new Avaliacao();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }

    public String getClassificacao(){
        return classificacao;
    }
    
     public void avalia(double nota) {
        avaliacao.adicionarNota(nota);
    }

    public void avalia(int nota) {
        avalia((double) nota);
    }

    public void avalia(double[] notas) {
        for (double nota : notas) {
            avalia(nota);
        }
    }

    public void avaliaComValidacao(double nota) throws Exception {
        if (nota < 0 || nota > 10) {
            throw new Exception("Nota inválida. Informe valor entre 0 e 10.");
        }
        avalia(nota);
    }

    public double retornaMedia() {
        return avaliacao.media();
    }

    public void exibeFichaCompleta() {
        exibeTitulo();
        
    }

    
    
    public void setSuaAva(int suaAvaliacao){
        if (suaAvaliacao >= 11) {
            throw new IllegalArgumentException("O apontuação máxima é 10");
            
        }else if (suaAvaliacao <= 0){
            throw new IllegalArgumentException("O apontuação mínima é 1");
        }
        this.suaAvaliacao = suaAvaliacao;
    }


    public void exibeTitulo(){
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + ano);
        System.out.println("Classificação indicada: " + classificacao);
        System.out.println("Média das avaliações: " + avaliacao.media());
        System.out.println("Sua avalição: " + suaAvaliacao);
        
    }
}
