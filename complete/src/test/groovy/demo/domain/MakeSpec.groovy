package demo.domain

import demo.domain.Make
import grails.gorm.transactions.Rollback
import org.grails.orm.hibernate.HibernateDatastore
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class MakeSpec extends Specification {
    @Shared @AutoCleanup HibernateDatastore datastore = new HibernateDatastore(getClass().getPackage())

    @Rollback
    def "Make created with name"() {
        when:
        final makeInstance = new Make(name: 'Ford')
        makeInstance.save(flush: true)

        then:
        Make.count()
    }
}
