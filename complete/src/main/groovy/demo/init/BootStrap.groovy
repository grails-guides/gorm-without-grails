package demo.init

import demo.domain.Manufacturer
import demo.domain.Vehicle
import demo.service.ManufacturerService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@CompileStatic
class BootStrap {

    @Autowired
    ManufacturerService manufacturerService

    @Transactional
    void init() {
        Manufacturer audi = new Manufacturer(name: 'audi')
        audi.addToVehicles(new Vehicle(name: 'A3', yearOfManufacture: 1996))
        audi.addToVehicles(new Vehicle(name: 'A4', yearOfManufacture: 1994))
        manufacturerService.save(audi)

        Manufacturer ford = new Manufacturer(name: 'ford')
        ford.addToVehicles(new Vehicle(name: 'Ford KA', yearOfManufacture: 1996))
        manufacturerService.save(ford)
    }
}
