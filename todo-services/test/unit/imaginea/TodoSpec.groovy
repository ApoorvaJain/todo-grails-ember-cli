package imaginea

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Todo)
class TodoSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test all validations"(){
    	when: 'title is passed as empty'
    	def t = new Todo(title: '', dueDate: new GregorianCalendar(2015, Calendar.MAY, 15).time)

    	then: 'validation should fail'
    	!t.validate()

    	when: 'title is not passed at all'
    	t = new Todo(dueDate: new GregorianCalendar(2015, Calendar.MAY, 15).time)

    	then: 'validation should fail'
    	!t.validate()

    	when: 'valid title and dueDate are passed'
		t = new Todo(title: 'Todo Item 1', dueDate: new GregorianCalendar(2015, Calendar.MAY, 15).time)

		then: 'validation should pass'
		t.validate()
    }

    void "Test default values"(){
    	when: 'dueDate is not provided'
    	def t = new Todo(title: 'Todo Item 1')

    	then: 't.dueDate should not be null'
    	t.dueDate
    }

    void "Test Persistance"(){
    	when: 'Todo is saved'
    	def t = new Todo(title: 'Todo Item 1', dueDate: new GregorianCalendar(2015, Calendar.May, 15).time)
    	t.save(flush: true, failOnError: true)

    	then: 't.id should exist'
    	t.id
    }
}
