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
}
