public class documentario extends titulo {

    private String duracaoDoc;
    


    
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


