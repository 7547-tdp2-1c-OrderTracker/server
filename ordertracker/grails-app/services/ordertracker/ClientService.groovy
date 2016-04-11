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

        return [paging:[limit:limit, offset:offset, total:Client.count()], results: list]
    }

    def createFromJson(json) {
        new Client(json).save()
    }

    def updateFromJson(id, json) {
    	def client = Client.get(id)
        if (!client) {
            return [content: null, status: 204]
        }
    	client.properties = json
    	client.save()
        return [content: client.toJson(), status: 200]
    }

    def deleteFromJson(id) {
    	def client = Client.get(id)
        if (!client) {
            return [content: null, status: 204]
        }
    	client.delete()
        return [content: client.toJson(), status: 202]
    }

    def get(id) {
        def client = Client.get(id)
        if (!client) {
            return [content: null, status: 204]
        } else {
            return [content: client.toJson(), status: 200]
        }
    }
}
