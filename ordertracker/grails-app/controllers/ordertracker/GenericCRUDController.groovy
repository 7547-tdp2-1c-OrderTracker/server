package ordertracker

import ordertracker.exception.ExistingEntityException
import ordertracker.exception.DuplicatedEntityException
import ordertracker.exception.InvalidEntityException
import ordertracker.exception.NotFoundEntityException

abstract class GenericCRUDController<E> {

	def errorHandlerService

	def list() {
		try {
			//assertCallerAdmin()
			int limit = (params.limit ?: 10) as int
			int offset = (params.offset ?: 0) as int
			String sort = params.sort
			String order = params.order ?: "asc"
			Map resp = getService().list(limit, offset, sort, order)
			jsonRender(response:resp, status:200)
		} catch (Exception e) {
			def resp = errorHandlerService.handleException(e).response
			jsonRender(response:resp, status:resp.status)
		}
	}

	def create() {
		Map resp = [:]
		try {
			//assertCallerAdmin()
			Map json = request.JSON
			getService().createFromJson(json)
			resp.status = 201
		} catch (ExistingEntityException e) {
			resp = e.getResponseMap()
		} catch (DuplicatedEntityException e) {
			resp = e.getResponseMap()
		} catch (InvalidEntityException e) {
			resp = e.getResponseMap()
		} catch (Exception e) {
			resp = errorHandlerService.handleException(e)?.response
		} finally {
			jsonRender(response:resp, status:resp.status)
		}
	}

	def update() {
		Map resp = [:]
		try {
			//assertCallerAdmin()
			if (!params.id) {
				resp.content = "Missing id at the end of the url"
				resp.status = 500
			} else {
				Map json = request.JSON
				resp = getService().updateFromJson(params.id, json)
			}
		} catch (InvalidEntityException e) {
			resp = e.getResponseMap()
		} catch (NotFoundEntityException e) {
			resp = e.getResponseMap()
		} catch (Exception e) {
			resp = errorHandlerService.handleException(e)?.response
		} finally {
			[response:resp, status:resp.status]
		}
	}

	def delete() {
		Map resp = [:]
		try {
			//assertCallerAdmin()
			if (!params.id) {
				resp.content = "Missing id at the end of the url"
				resp.status = 500
			} else {
				resp = getService().deleteFromJson(params.id)
			}
		} catch (NotFoundEntityException e) {
			resp = e.getResponseMap()
		} catch (Exception e) {
			resp = errorHandlerService.handleException(e)?.response
		} finally {
			jsonRender(response:resp, status:resp.status)
		}
	}

	def get() {
		Map resp = [:]
		try {
			//assertCallerAdmin()
			if (!params.id) {
				resp.content = "Missing id at the end of the url"
				resp.status = 500
			} else {
				resp = getService().get(params.id)
			}
		} catch (NotFoundEntityException e) {
			resp = e.getResponseMap()
		} catch (Exception e) {
			resp = errorHandlerService.handleException(e)?.response
		} finally {
			jsonRender(response:resp, status:resp.status)
		}
	}

	def jsonRender(json) {
    	render(contentType: "application/json") {
		    json
		}
    }

    abstract def getService();
	
}
