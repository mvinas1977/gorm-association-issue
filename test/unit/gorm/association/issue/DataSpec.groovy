package gorm.association.issue

import spock.lang.Specification

import grails.test.mixin.TestFor
import grails.util.Holders

import org.codehaus.groovy.grails.commons.DomainClassArtefactHandler
import org.codehaus.groovy.grails.commons.GrailsDomainClass
import org.codehaus.groovy.grails.commons.GrailsDomainClassProperty

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Data)
class DataSpec extends Specification {

    void "test something"() {
        given:
        String propertyName = 'createdBy'
        when:
        GrailsDomainClass dc = (GrailsDomainClass) Holders.getGrailsApplication().getArtefact(DomainClassArtefactHandler.TYPE, Data.name)
        GrailsDomainClassProperty property = dc.getPersistentProperty(propertyName)

        then:
        property
        property.isAssociation()
    }
}
