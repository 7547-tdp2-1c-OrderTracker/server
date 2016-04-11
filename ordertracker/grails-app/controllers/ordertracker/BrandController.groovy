package ordertracker

import ordertracker.Brand

class BrandController extends GenericCRUDController<Brand> {
	static defaultAction = "list"

	def brandService

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
		brandService
	}
}
