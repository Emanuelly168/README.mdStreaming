public class sitespartacus{
    public static void main(String[] args) throws Exception {
        pessoas academiaDados = new pessoas();
        treino dadosTreino = new treino();
            academiaDados.setNome("Rey Skaywalker");
            academiaDados.setEmail("rey.skaywalker@gmail.com");
            academiaDados.setTelefone(61981345628l);
            academiaDados.setCpf(12345678900l);
            academiaDados.setNivel("intermediario");
            //academiaDados.nivel = "avançado";

            dadosTreino.setNomeTreinador("Kaylo Ren");
            dadosTreino.setCpfTreinador(44547899033l);
            dadosTreino.setEmailTreinador("ben.solo@gmail.com");
            dadosTreino.setEspecializacao("Teoria e Prática do Exercício Físico Aplicado às Lesões e Doenças Musculoesqueléticas");
            dadosTreino.setExercicio("Peito, tríceps e ombro:\n" + //
                                "\n" + //
                                "Supino com barra: 4x8\n" + //
                                "Crucifixo : 3x15\n" + //
                                "Pullover : 4x12\n" + //
                                "Tríceps testa : 4x10\n" + //
                                "Tríceps corda : 3x 12/10/8 (progredindo carga e diminuindo repetição)\n" + //
                                "Desenvolvimento : 4x15\n" + //
                                "Elevação lateral : 3x10 ");
            //dadosTreino.exercicio = "Perna:\n" + //
                                //"\n" + //
                                //"Agachamento: 4x8\n" + //
                                //"Leg 45°: 3x12\n" + //
                                //"Extensora : 4x12\n" + //
                                //"Stiff :3x10\n" + //
                                //"Passada : 3x10\n" + //
                                //"Búlgaro : 3x15";
            

            
        academiaDados.exibeDadosPessoas();
        dadosTreino.exibeDadosTreino();

    }

}
