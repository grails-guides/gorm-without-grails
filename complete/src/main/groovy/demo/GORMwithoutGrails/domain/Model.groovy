package demo.GORMwithoutGrails.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Model implements GormEntity<Model> {

    String name

    static mapping = {
        version false
    }

    static constraints = {
    }
}
