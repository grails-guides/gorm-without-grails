package demo.service

import demo.domain.Manufacturer
import grails.gorm.services.Service as GormService

import groovy.transform.CompileStatic
import org.springframework.stereotype.Service as SpringService

@CompileStatic
@GormService(Manufacturer)
@SpringService
interface ManufacturerService {

    List<Manufacturer> findAll()

    Manufacturer save(Manufacturer manufacturer)
}
