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
    	def offset = params.offset
    	def limit = params.limit

    	if (!limit) limit = "10"
    	if (!offset) offset = "0"

    	limit = limit.toInteger()
    	offset = offset.toInteger()

    	def vendor = ordertracker.Vendor.get(params.vendor_id)
    	def entries = vendor.getEntries()
    	def clientIds = []

    	entries.each {
    		clientIds.add(it.clientId)
    	}

    	clientIds = clientIds.unique { a, b -> a <=> b }

    	def finalOffset = offset+limit-1;
    	if (finalOffset > clientIds.size) finalOffset = clientIds.size-1;
    	def clients = ordertracker.Client.getAll(clientIds[offset..finalOffset]);

    	def result = [
    		'results': clients,
    		'paging': [
    			'total': clientIds.size,
    			'offset': offset,
    			'limit': limit
    		]
    	]
    	render result as JSON
    }

    def get() {
    	def client = ordertracker.Client.get(params.id)
    	render client as JSON
    }
}
