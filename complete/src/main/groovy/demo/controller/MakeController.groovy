package demo.controller

import demo.service.MakeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/makes")
class MakeController {

    @Autowired MakeService makeService

    @RequestMapping("/")
    String index(){
        makeService.list()
    }
}
