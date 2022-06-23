package SERVICE.WEB.Controller;

import SERVICE.WEB.Models.Comcel;
import SERVICE.WEB.Service.Comcel.ComcelService;
import SERVICE.WEB.Util.ResourceNotFound;
import SERVICE.WEB.Validation.RecargaComcel.ComcelValidation;
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
@RequestMapping(value = "api/comcel")
public class ComcelController {

    @Autowired
    private ComcelService comcelService;

    @Autowired
    private ComcelValidation comcelValidation;


    @RequestMapping(value = "List",method = RequestMethod.GET)
    public ResponseEntity<List<Comcel>>getList(){
        Map<String,Object>response=new HashMap<>();
        List list = comcelService.getList();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveComcel(@RequestBody Comcel comcel)throws ResourceNotFound{
        Map<String , Object>response=new HashMap<>();

        this.comcelValidation.Validation(comcel);
        this.comcelService.SaveComcel(comcel);
        response.put("Mensaje","Recarga Exitosa ");
        return new  ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
