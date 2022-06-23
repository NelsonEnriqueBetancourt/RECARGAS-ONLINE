package SERVICE.WEB.Validation.RecargaTigo;

import SERVICE.WEB.Models.Tigo;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class TigoValidation implements TigoValidate {

    private void MessageRecarga(String message)throws ResourceNotFound {
        throw new ResourceNotFound(message);
    }

    @Override
    public void Validation(Tigo tigo) throws ResourceNotFound {
        if (tigo.getNumeroPhone()==0){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
        if (tigo.getValorRecarga()==0){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
    }
}
