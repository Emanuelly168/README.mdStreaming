public class titulo {
    
    private String nome;
    private int ano;
    private String classificacao;
    private int avaliacao;
    public int suaAvaliacao;

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

    public void setAva(int avaliacao){
        this.avaliacao = avaliacao;
    }

    public int getAva(){
        return avaliacao;
    }

    public int getSuaAva(){
       return suaAvaliacao;
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
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + ano);
        System.out.println("Classificação indicada: " + classificacao);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Sua avalição: " + suaAvaliacao);
        
    }

    


























}
