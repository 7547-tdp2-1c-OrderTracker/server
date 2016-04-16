package ordertracker

import ordertracker.Brand

class BrandController extends GenericCRUDController<Brand> {
	static defaultAction = "list"

	def brandService

	@Override
	def list() {
		super.list()
	}

	@Override
	def create() {
		super.create()
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
