package demo

import org.springframework.boot.ApplicationArguments
import demo.init.BootStrap
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
@CompileStatic
@SpringBootApplication
class Application implements ApplicationRunner {

    @Autowired
    BootStrap bootStrap

    static void main(String[] args) {
        SpringApplication.run Application, args
    }

    void run(ApplicationArguments args) throws Exception {
        bootStrap.init()
    }
}
