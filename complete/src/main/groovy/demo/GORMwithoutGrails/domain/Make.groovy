package demo.GORMwithoutGrails.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Make implements GormEntity<Make> {

    /** Properties */
    String name

    /** Required in order to bootstrap data */
    static mapping = {
        version false
    }

    static constraints = {
    }
}
