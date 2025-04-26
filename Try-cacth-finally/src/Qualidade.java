public class Qualidade extends Download{
    private String qualidade;
    
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
