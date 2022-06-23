package SERVICE.WEB.Service.Movistar;

import SERVICE.WEB.Models.Movistar;
import SERVICE.WEB.Repository.Movistar.MovistarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovistarService {

    @Autowired
    private MovistarRepository movistarRepository;


    public List<Movistar>getList(){
        return movistarRepository.findAll();
    }

    public void SaveMovistar(Movistar movistar){
        movistarRepository.save(movistar);
    }
}
