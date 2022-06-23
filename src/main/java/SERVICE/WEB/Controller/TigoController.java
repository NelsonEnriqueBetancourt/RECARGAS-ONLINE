package SERVICE.WEB.Controller;


import SERVICE.WEB.Models.Tigo;
import SERVICE.WEB.Service.Tigo.TigoService;
import SERVICE.WEB.Util.ResourceNotFound;
import SERVICE.WEB.Validation.RecargaTigo.TigoValidation;
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
@RequestMapping(value = "api/tigo")
public class TigoController {
    @Autowired
    private TigoService tigoService;

    @Autowired
    private TigoValidation tigoValidation;


    @RequestMapping(value = "List",method = RequestMethod.GET)
    public ResponseEntity<List<Tigo>> getList(){
        Map<String,Object> response=new HashMap<>();
        List list = tigoService.getList();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveMovistar(@RequestBody Tigo tigo)throws ResourceNotFound {
        Map<String , Object>response=new HashMap<>();

        this.tigoValidation.Validation(tigo);
        this.tigoService.SaveTigo(tigo);
        response.put("Mensaje","Recarga Exitosa ");
        return new  ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
