package SERVICE.WEB.Controller;


import SERVICE.WEB.Models.Uff;
import SERVICE.WEB.Service.Uff.UffService;
import SERVICE.WEB.Util.ResourceNotFound;
import SERVICE.WEB.Validation.RecargaUff.UffValidation;
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
@RequestMapping(value = "api/uff")
public class UffController {

    @Autowired
    private UffService uffService;

    @Autowired
    private UffValidation uffValidation;


    @RequestMapping(value = "List",method = RequestMethod.GET)
    public ResponseEntity<List<Uff>> getList(){
        Map<String,Object> response=new HashMap<>();
        List list = uffService.getList();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveMovistar(@RequestBody Uff uff)throws ResourceNotFound {
        Map<String , Object>response=new HashMap<>();

        this.uffValidation.Validation(uff);
        this.uffService.SaveUff(uff);
        response.put("Mensaje","Recarga Exitosa ");
        return new  ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
