package ordertracker.exception

class NotFoundEntityException extends OrderTrackerException {
	
	NotFoundEntityException(String entityName) {
		super("No se encontro el/la ${entityName}")
	}
	
	void setDefaultValues() {
		error = "not_found_entity_error"
		internalCause = []
		status = 404
	}
}
