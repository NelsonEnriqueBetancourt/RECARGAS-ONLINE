package SERVICE.WEB.Controller;

import SERVICE.WEB.Models.Movistar;
import SERVICE.WEB.Service.Movistar.MovistarService;
import SERVICE.WEB.Util.ResourceNotFound;
import SERVICE.WEB.Validation.RecargaMovistar.MovistarValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value = "api/movistar")
public class MovistarController {

    @Autowired
    private MovistarService movistarService;

    @Autowired
    private MovistarValidation movistarValidation;


    @RequestMapping(value = "List",method = RequestMethod.GET)
    public ResponseEntity<List<Movistar>> getList(){
        Map<String,Object> response=new HashMap<>();
        List list = movistarService.getList();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveMovistar( @RequestBody Movistar movistar)throws ResourceNotFound {
        Map<String , Object>response=new HashMap<>();

        this.movistarValidation.Validation(movistar);
        this.movistarService.SaveMovistar(movistar);
        response.put("Mensaje","Recarga Exitosa ");
        return new  ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
