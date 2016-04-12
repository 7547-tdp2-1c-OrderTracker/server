package ordertracker

import grails.transaction.Transactional
import ordertracker.Brand

@Transactional
class BrandService {

    def list(limit = null, offset = null, sort = null, order = null) {
        def list = null
        def newList = []

        Brand.withTransaction { status ->
           list = Brand.list(max: limit, offset: offset, sort: sort, order: order)
           list.each{
           		newList << it.toJson()
           }
        }

        return [paging:[limit:limit, offset:offset, total:Brand.count()], results: newList]
    }

    def createFromJson(json) {
        new Brand(json).save()
    }

    def updateFromJson(id, json) {
    	def brand = Brand.get(id)
        if (!brand) {
            return [content: null, status: 204]
        }
    	brand.properties = json
    	brand.save()
        return [content: brand.toJson(), status: 200]
    }

    def deleteFromJson(id) {
    	def brand = Brand.get(id)
        if (!brand) {
            return [content: null, status: 204]
        }
    	brand.delete()
        return [content: brand.toJson(), status: 202]
    }

    def get(id) {
        def brand = Brand.get(id)
        if (!brand) {
            return [content: null, status: 204]
        } else {
            return [content: brand.toJson(), status: 200]
        }
    }
}
