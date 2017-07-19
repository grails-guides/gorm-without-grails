package demo.GORMwithoutGrails.domain

import grails.gorm.transactions.Rollback
import org.grails.orm.hibernate.HibernateDatastore
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class VehicleSpec extends Specification {
    @Shared @AutoCleanup HibernateDatastore datastore = new HibernateDatastore(getClass().getPackage())

    @Rollback
    def "Vehicle created with a name"() {
        when:
        final makeInstance = new Make(name: 'Ford')
        final modelInstance = new Model(name: 'Test Model')
        final vehicleInstance = new Vehicle(name: 'Test Vehicle', make: makeInstance, model: modelInstance)
        vehicleInstance.save(flush: true)

        then:
        Vehicle.count()
    }
}
