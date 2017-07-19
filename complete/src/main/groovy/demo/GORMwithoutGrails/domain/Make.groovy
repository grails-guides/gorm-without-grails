package demo.GORMwithoutGrails.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Make implements GormEntity<Make> {

    String name

    static mapping = {
        version false
    }

    static constraints = {
    }
}