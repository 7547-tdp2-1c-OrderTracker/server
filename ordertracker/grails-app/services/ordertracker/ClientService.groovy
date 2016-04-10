package ordertracker

import grails.transaction.Transactional
import ordertracker.Client

@Transactional
class ClientService {

    def list(limit = null, offset = null, sort = null, order = null) {
        def list = null
        Client.withTransaction { status ->
    	   list = Client.list(max: limit, offset: offset, sort: sort, order: order)
        }
        return list
    }

    def createFromJson(json) {
        new Client(json).save()
    }

    def updateFromJson(json) {
    	def client = Client.get(json.id)
    	client.properties = json
    	client.save()
    }

    def deleteFromJson(json) {
    	def client = Client.get(json.id)
    	client.delete()
    }
}
