import gorm.association.issue.Data

import grails.test.spock.IntegrationSpec
import grails.util.Holders

import org.codehaus.groovy.grails.commons.DomainClassArtefactHandler
import org.codehaus.groovy.grails.commons.GrailsDomainClass
import org.codehaus.groovy.grails.commons.GrailsDomainClassProperty

class DataIntegrationSpec extends IntegrationSpec {

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
