package demo.domain

import grails.gorm.annotation.Entity

@Entity
class Driver extends User {

    /** Properties */
    String name

    static hasMany = [ vehicles: Vehicle ]

    /** Required in order to bootstrap data */
    static mapping = {
        version false
    }

    static constraints = {
        vehicles nullable: true
    }
}
