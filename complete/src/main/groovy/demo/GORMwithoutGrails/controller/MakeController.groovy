package demo.GORMwithoutGrails.controller

import demo.GORMwithoutGrails.service.MakeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/makes")
class MakeController {

    @Autowired MakeService makeService

//    PostController(MakeService makeService) {
//        this.makeService = makeService
//    }

    @RequestMapping("/")
    String list(){
        makeService.list()
    }

//    @RequestMapping("/{id}")
//    public String get(@PathVariable(value = "id") int id){
//        makeService.get(id)
//    }
}
