package com.example.demo

class PersonDAOTest extends spock.lang.Specification {

    void setup() {
    }

    def "Check name if i set up my name for person"() {
        given:
        PersonDAO person = PersonDAO.builder()
                .name("Name")
                .build()

        when:
        person.setName("Two")

        then:
        person.getName() == "Two"
    }
}
