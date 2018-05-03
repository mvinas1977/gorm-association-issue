package gorm.association.issue

class User extends BaseDomain {

    String userName
    User supervisor

    static constraints = {
    }

    static mappedBy = [
        createdBy: null
    ]
}
