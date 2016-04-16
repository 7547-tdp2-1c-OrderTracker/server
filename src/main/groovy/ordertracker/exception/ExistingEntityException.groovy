package ordertracker.exception

class ExistingEntityException extends OrderTrackerException {
	
	def entity
	
	ExistingEntityException(String entityName, def entity) {
		super("${entityName} existente: ${entity}")
		this.entity = entity
	}

	void setDefaultValues() {
		error = "existing_entity_error"
		internalCause = []
		status = 405
	}
}