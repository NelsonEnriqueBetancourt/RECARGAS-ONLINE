package SERVICE.WEB.Validation.RecargaUff;

import SERVICE.WEB.Models.Uff;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class UffValidation implements UffValidate {

    private void MessageRecarga(String message)throws ResourceNotFound {
        throw new ResourceNotFound(message);
    }

    @Override
    public void Validation(Uff uff) throws ResourceNotFound {
        if (uff.getNumeroPhone()==0){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
        if (uff.getValorRecarga()==0){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
    }
}
