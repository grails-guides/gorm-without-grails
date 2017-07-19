package demo.GORMwithoutGrails.domain

import grails.gorm.annotation.Entity

@Entity
class Vehicle {

    String name

    Make make
    Model model


    static constraints = {
    }
}
