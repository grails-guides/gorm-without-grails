package demo.GORMwithoutGrails

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class GormWithoutGrailsApplication {

    static void main(String[] args) {

        SpringApplication.run GormWithoutGrailsApplication, args
    }
}
