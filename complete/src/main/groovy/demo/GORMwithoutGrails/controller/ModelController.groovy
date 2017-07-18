package demo.GORMwithoutGrails.controller

import demo.GORMwithoutGrails.service.ModelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/models")
class ModelController {

    @Autowired ModelService modelService

//    PostController(MakeService makeService) {
//        this.makeService = makeService
//    }

    @RequestMapping("/")
    String list(){
        modelService.list()
    }

//    @RequestMapping("/{id}")
//    public String get(@PathVariable(value = "id") int id){
//        makeService.get(id)
//    }
}
