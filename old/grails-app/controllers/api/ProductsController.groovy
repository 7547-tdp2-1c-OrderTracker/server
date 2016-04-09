package api

import grails.converters.JSON

class ProductsController {
    def list() { 
    	def offset = params.offset
    	def limit = params.limit

    	if (!limit) limit = "10"
    	if (!offset) offset = "0"

    	limit = limit.toInteger()
    	offset = offset.toInteger()

    	def total = ordertracker.Product.count()
    	def products = ordertracker.Product.findAll([max:limit, offset:offset])

    	def result = [
    		'results': products,
    		'paging': [
    			'total': total,
    			'offset': offset,
    			'limit': limit
    		]
    	]
    	render result as JSON
    }

    def get() {
    	def product = ordertracker.Product.get(params.id)
    	render product as JSON
    }

    // curl -H "Content-Type: application/json" -X POST -d@products.json  http://localhost:8080/v1/clients/seed
    def seed() {
        // borrar todos los clients de la base
        ordertracker.Product.findAll().each {
            it.delete()
        }

        request.JSON.each {
            // crear la entidad
            def newProduct = new ordertracker.Product(it)
            newProduct.save(faileOnError: true);
        }
        render request.JSON
    }

}
