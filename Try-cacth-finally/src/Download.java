public abstract class Download extends titulo{
    private int dowloadMb;

    public void setDowloadMb(int dowloadMb){
        this.dowloadMb = dowloadMb;
    }
    public int getDowloadMb(){
        return dowloadMb;
    }

    public void exibeDowload(){
        System.out.println(getNome() + " está disponível para dowload!");
    }
       
     
    public abstract void dowloadMidia();
    
    @Override
    public void exibeTitulo(){
        super.exibeTitulo();
        System.out.println("Tamanho do dowload: " + dowloadMb + "MB");
    }


    



}
