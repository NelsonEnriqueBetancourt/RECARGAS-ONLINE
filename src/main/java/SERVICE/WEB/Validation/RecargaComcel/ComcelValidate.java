package SERVICE.WEB.Validation.RecargaComcel;

import SERVICE.WEB.Models.Comcel;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface ComcelValidate {

    public void Validation(Comcel comcel)throws ResourceNotFound;

}
