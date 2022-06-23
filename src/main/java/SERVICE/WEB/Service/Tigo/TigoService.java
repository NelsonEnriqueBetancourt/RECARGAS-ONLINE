package SERVICE.WEB.Service.Tigo;

import SERVICE.WEB.Models.Tigo;
import SERVICE.WEB.Repository.Tigo.TigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TigoService {

    @Autowired
    private TigoRepository tigoRepository;


    public List<Tigo>getList(){
        return tigoRepository.findAll();
    }

    public void SaveTigo(Tigo tigo){
        tigoRepository.save(tigo);
    }
}
