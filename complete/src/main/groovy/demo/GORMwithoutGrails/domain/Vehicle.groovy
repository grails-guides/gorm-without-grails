package demo.GORMwithoutGrails.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Vehicle implements GormEntity<Vehicle> {

    String name

    Make make
    Model model

    static mapping = {
        version false
    }

    static constraints = {
    }
}
