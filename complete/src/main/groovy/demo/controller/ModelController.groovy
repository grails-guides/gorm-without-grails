package demo.controller

import demo.service.ModelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/models")
class ModelController {

    @Autowired ModelService modelService

    @RequestMapping("/")
    String index(){
        modelService.list()
    }
}
