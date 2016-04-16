package ordertracker

import ordertracker.Client

class ClientController extends GenericCRUDController<Client> {
	static defaultAction = "list"

	def clientService

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
		clientService
	}
}
