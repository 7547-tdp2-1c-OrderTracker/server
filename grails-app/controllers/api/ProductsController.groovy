package api

import grails.converters.JSON

class ProductsController {
    def index() { 
    	def result = [
    		'results': [1,2,3,4],
    		'a':1,
    		'b':2
    	]
    	render result as JSON
   	}
}