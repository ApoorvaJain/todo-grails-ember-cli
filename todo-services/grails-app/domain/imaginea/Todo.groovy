package imaginea
//import grails.rest.*

//@Resource(uri='/todo')
class Todo {

	String title
	Date dueDate

    static constraints = {
    	title blank: false
    }

    static mapping = {
    	dueDate defaultValue: "now()"
    }
}
