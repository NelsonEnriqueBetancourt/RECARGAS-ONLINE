package SERVICE.WEB.Validation.RecargaMovistar;

import SERVICE.WEB.Models.Movistar;
import SERVICE.WEB.Util.ResourceNotFound;
import org.springframework.stereotype.Service;


@Service
public interface MovistarValidate {

    public void Validation(Movistar movistar)throws ResourceNotFound;

}
