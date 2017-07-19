package demo.GORMwithoutGrails.domain

import grails.gorm.annotation.Entity

@Entity
class Driver extends User {

    String name

    static hasMany = [ vehicles: Vehicle ]

    static mapping = {
        version false
    }

    static constraints = {
        vehicles nullable: true
    }
}
