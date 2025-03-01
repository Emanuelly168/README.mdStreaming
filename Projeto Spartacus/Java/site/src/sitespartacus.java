public class sitespartacus{
    public static void main(String[] args) {
        dados academiDados = new dados();
        academiDados.nome = "Larissa Silva";
        academiDados.nomeTreinador = "Valéria Lins";
        academiDados.nivel = "Iniciante";
        academiDados.treino = "Supino máquina : 3 séries de 10 a 12x\n" + //
                        "Rosca direta : 3 séries de 10 a 12x\n" + //
                        "Cadeira extensora : 3 séries de 10 a 12x \n" + //
                        "Cadeira adutora : 3 séries de 10 a 12x \n" + //
                        "Elevação lateral 3x 10 a 12x\n" + //
                        "Esteira 20min";

        academiDados.exibeDadosTreino();
    }

}
