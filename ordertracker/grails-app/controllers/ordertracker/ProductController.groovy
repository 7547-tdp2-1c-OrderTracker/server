package ordertracker

import ordertracker.Product

class ProductController extends GenericCRUDController<Product> {
	static defaultAction = "list"

	def productService

	@Override
	def list() {
		// render(contentType: "application/json") {
			super.list()
		// }
	}

	@Override
	def create() {
		// render(contentType: "application/json") {
			super.create()
		// }
	}

	@Override
	def update() {
		render(contentType: "application/json") {
		    super.update()
		}
	}

	@Override
	def delete() {
		render(contentType: "application/json") {
		    super.delete()
		}
	}

	@Override
	def get() {
		render(contentType: "application/json") {
		    super.get()
		}
	}

	@Override
	def getService() {
		productService
	}
}