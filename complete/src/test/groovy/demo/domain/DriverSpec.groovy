package demo.domain

import org.grails.orm.hibernate.HibernateDatastore
import spock.lang.Specification
import grails.gorm.transactions.Rollback
import spock.lang.AutoCleanup
import spock.lang.Shared

class DriverSpec extends Specification {

    @Shared @AutoCleanup
    HibernateDatastore datastore = new HibernateDatastore(getClass().getPackage())

    @Rollback
    def "Driver created with name"() {
        when:
        final driverInstance = new Driver(name: 'Test Driver', username: 'td', password: 'password1')
        driverInstance.save(flush: true)

        then:
        Driver.count()
    }
}
