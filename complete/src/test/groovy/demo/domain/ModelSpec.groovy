package demo.domain

import demo.domain.Model
import grails.gorm.transactions.Rollback
import org.grails.orm.hibernate.HibernateDatastore
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class ModelSpec extends Specification {
    @Shared @AutoCleanup HibernateDatastore datastore = new HibernateDatastore(getClass().getPackage())

    @Rollback
    def "Model created with name"() {
        when:
        final modelInstance = new Model(name: 'Test Model')
        modelInstance.save(flush: true)

        then:
        Model.count()
    }
}
