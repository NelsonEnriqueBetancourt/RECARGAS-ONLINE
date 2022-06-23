package SERVICE.WEB.Validation.RecargaTigo;

import SERVICE.WEB.Models.Tigo;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface TigoValidate {

    public void Validation(Tigo tigo)throws ResourceNotFound;

}
