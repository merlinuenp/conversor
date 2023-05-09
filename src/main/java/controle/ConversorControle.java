package controle;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Conversor;

@Named
@ViewScoped
public class ConversorControle implements Serializable {
    private Conversor conversor;
    
    
    public ConversorControle(){
        conversor = new Conversor(); 
    }

    public Conversor getConversor() {
        return conversor;
    }

    public void setConversor(Conversor conversor) {
        this.conversor = conversor;
    }
    
    
    
}
