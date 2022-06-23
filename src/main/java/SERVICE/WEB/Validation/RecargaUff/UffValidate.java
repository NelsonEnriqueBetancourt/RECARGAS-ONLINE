package SERVICE.WEB.Validation.RecargaUff;

import SERVICE.WEB.Models.Uff;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface UffValidate {

    public void Validation(Uff uff)throws ResourceNotFound;

}
