class BootStrap {

    def init = { servletContext ->
		new imaginea.Todo(title: 'Todo Item1', dueDate: new GregorianCalendar(2015, Calendar.JUNE, 18).time).save(failOnError:true)
		new imaginea.Todo(title: 'Todo Item2', dueDate: new GregorianCalendar(2015, Calendar.JUNE, 19).time).save(failOnError:true)
		new imaginea.Todo(title: 'Todo Item3', dueDate: new GregorianCalendar(2015, Calendar.JUNE, 20).time).save(failOnError:true)
    }
    def destroy = {
    }
}
