package demo.GORMwithoutGrails.domain

import grails.persistence.Entity

@Entity
class Vehicle {

    String name

    Make make
    Model model


    static constraints = {
    }
}
