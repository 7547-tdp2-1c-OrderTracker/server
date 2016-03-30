package api

import grails.converters.JSON

class ClientsController {

    def list() { 
    	def offset = params.offset
    	def limit = params.limit

    	if (!limit) limit = "10"
    	if (!offset) offset = "0"

    	limit = limit.toInteger()
    	offset = offset.toInteger()

    	def total = ordertracker.Client.count()
    	def clients = ordertracker.Client.findAll([max:limit, offset:offset])

    	def result = [
    		'results': clients,
    		'paging': [
    			'total': total,
    			'offset': offset,
    			'limit': limit
    		]
    	]
    	render result as JSON
    }

    def vendor() {
    	def vendor = ordertracker.Vendor.get(params.vendor_id)
    	def ids = []
    	def entries = vendor.getEntries();

    	entries.each {
    		ids.add(it.getClient())
    	}
    	render ids as JSON
    }

    def get() {
    	def client = ordertracker.Client.get(params.id)
    	render client as JSON
    }
}
