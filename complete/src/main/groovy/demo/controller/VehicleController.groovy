package demo.controller

import demo.service.VehicleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vehicles")
class VehicleController {

    @Autowired VehicleService vehicleService

    @RequestMapping("/")
    String index(){
        vehicleService.list()
    }
}
