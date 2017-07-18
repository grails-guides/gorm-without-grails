package demo.GORMwithoutGrails.controller

import demo.GORMwithoutGrails.service.VehicleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vehicles")
class VehicleController {

    @Autowired VehicleService vehicleService

//    PostController(MakeService makeService) {
//        this.makeService = makeService
//    }

    @RequestMapping("/")
    String list(){
        vehicleService.list()
    }

//    @RequestMapping("/{id}")
//    public String get(@PathVariable(value = "id") int id){
//        makeService.get(id)
//    }
}
