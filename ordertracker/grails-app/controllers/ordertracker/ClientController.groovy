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
		super.update()
	}

	@Override
	def delete() {
		super.delete()
	}

	@Override
	def getService() {
		clientService
	}
}
