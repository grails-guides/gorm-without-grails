package demo.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Vehicle implements GormEntity<Vehicle> {
    /** Properties */
    String name

    /** Objects */
    Make make
    Model model

    /** Required in order to bootstrap data */
    static mapping = {
        version false
    }

    static constraints = {
    }
}
