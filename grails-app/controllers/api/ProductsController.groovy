package api

import grails.rest.RestfulController
import ordertracker.Product

class ProductsController extends RestfulController {
	static responseFormat = ['json', 'xml']

	ProductsController() {
		super(Product)
	}
}
