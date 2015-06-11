package imaginea
import grails.rest.*

class TodoController extends RestfulController {
	
	static responseFormats = ['json', 'xml']

	TodoController(){
		super(Todo)
	}    

	def index(){
		respond	Todo.list()
	}
}
