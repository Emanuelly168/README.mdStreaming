package funções;
import midia.titulo;
import java.util.ArrayList;
import java.util.List;

public class CatalogoDeMidia {
    private static CatalogoDeMidia uniqueInstance;
   
    private final List<titulo> titulo = new ArrayList<>();

    private CatalogoDeMidia() {
        
    }

    public static synchronized CatalogoDeMidia getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CatalogoDeMidia();
             
        }
         return uniqueInstance;
    }
       

    public void adicionarPublicacao(titulo Titulo) {
        titulo.add(Titulo);
    }

    public List<titulo> listarTitulos() {
        return new ArrayList<>(titulo);
    }
}
