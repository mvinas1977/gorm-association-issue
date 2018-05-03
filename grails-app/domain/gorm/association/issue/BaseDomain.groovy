package gorm.association.issue

abstract class BaseDomain {
    User createdBy

    static constraints = {
        createdBy(nullable: false)
    }
}
