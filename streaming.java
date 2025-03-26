public class treino {
    private String nomeTreinador;
    private String especializacao;
    public String exercicio;
    private long cpfTreinador;
    private String emailTreinador;



    public void setNomeTreinador(String nomeTreinador){
        this.nomeTreinador = nomeTreinador;
    }

    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }

    public String getExercicio(){
        return this.exercicio;
    }
    public void setExercicio(String exercicio){
        this.exercicio = exercicio;
    }

    public void setCpfTreinador(long cpfTreinador){
        this.cpfTreinador = cpfTreinador;
    }

    public void setEmailTreinador(String emailTreinador){
        this.emailTreinador = emailTreinador;
    }


    void exibeDadosTreino(){
        System.out.println("\nSeu treino de hoje: " + exercicio);
        System.out.println("\nNome do(a) Treinador(a): " + nomeTreinador);
        System.out.println("Especializacao do Treinador: " + especializacao);
        System.out.println("CPF do(a) Treinador(a): " + cpfTreinador);
        System.out.println("Email do(a) Treinador(a): " + emailTreinador);

    }
    
}
