package SERVICE.WEB.Service.Uff;

import SERVICE.WEB.Models.Uff;
import SERVICE.WEB.Repository.Uff.UffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UffService {

    @Autowired
    private UffRepository uffRepository;


    public List<Uff>getList(){
        return uffRepository.findAll();
    }

    public void SaveUff(Uff uff){
        uffRepository.save(uff);
    }
}
