package SERVICE.WEB.Validation.RecargaMovistar;

import SERVICE.WEB.Models.Movistar;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class MovistarValidation implements MovistarValidate {


    private void MessageRecarga(String message)throws ResourceNotFound {
        throw new ResourceNotFound(message);
    }

    @Override
    public void Validation(Movistar movistar) throws ResourceNotFound {
        if (movistar.getNumeroPhone()==0){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
        if (movistar.getValorRecarga()==0){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
    }
}
