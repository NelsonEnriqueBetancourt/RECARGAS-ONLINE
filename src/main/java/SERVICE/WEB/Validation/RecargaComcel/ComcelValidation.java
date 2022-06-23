package SERVICE.WEB.Validation.RecargaComcel;

import SERVICE.WEB.Models.Comcel;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class ComcelValidation implements ComcelValidate {

    private void MessageRecarga(String message)throws ResourceNotFound{
        throw new ResourceNotFound(message);
    }

    @Override
    public void Validation(Comcel comcel) throws ResourceNotFound {
        if (comcel.getNumeroPhone()==00){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
        if (comcel.getValorRecarga()==0){
            this.MessageRecarga("El Numero Del Celular Es Obligatorio,Intente Nuevamente");
        }
    }
}
