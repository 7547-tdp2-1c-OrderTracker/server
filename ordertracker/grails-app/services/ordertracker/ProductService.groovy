package ordertracker

import grails.transaction.Transactional
import ordertracker.Product

@Transactional
class ProductService {

    def list(limit = null, offset = null, sort = null, order = null) {
        def list = null

        Product.withTransaction { status ->
           list = Product.list(max: limit, offset: offset, sort: sort, order: order)
        }

        return [paging:[limit:limit, offset:offset, total:Product.count()], results: list]
    }

    def createFromJson(json) {
        new Product(json).save()
    }

    def updateFromJson(id, json) {
    	def product = Product.get(id)
        if (!product) {
            return [content: null, status: 204]
        }
    	product.properties = json
    	product.save()
        return [content: product.toJson(), status: 200]
    }

    def deleteFromJson(id) {
    	def product = Product.get(id)
        if (!product) {
            return [content: null, status: 204]
        }
    	product.delete()
        return [content: product.toJson(), status: 202]
    }

    def get(id) {
        def product = Product.get(id)
        if (!product) {
            return [content: null, status: 204]
        } else {
            return [content: product.toJson(), status: 200]
        }
    }
}
