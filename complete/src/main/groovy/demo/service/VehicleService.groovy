package demo.service

import demo.domain.Vehicle
import grails.gorm.services.Where
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service as SpringService
import grails.gorm.services.Service as GormService

@CompileStatic
@GormService(Vehicle)
@SpringService
interface VehicleService {

    @Where({ manufacturer.name == manufacturerName })
    List<Vehicle> findAllByManufacturer(String manufacturerName)

}
