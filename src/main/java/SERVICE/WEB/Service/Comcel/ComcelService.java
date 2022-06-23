package SERVICE.WEB.Service.Comcel;

import SERVICE.WEB.Models.Comcel;
import SERVICE.WEB.Repository.Comcel.ComcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComcelService {

    @Autowired
    private ComcelRepository comcelRepository;


    public List<Comcel>getList(){
        return comcelRepository.findAll();
    }

    public void SaveComcel(Comcel comcel){
        comcelRepository.save(comcel);
    }
}
