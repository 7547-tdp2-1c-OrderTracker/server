package ordertracker.exception

class DuplicatedEntityException extends OrderTrackerException {
	
	DuplicatedEntityException(String entityName, String duplicatedName) {
		super("El/la ${entityName} <${duplicatedName}> ya existe con estos mismos valores")
	}

	void setDefaultValues() {
		error = "duplicated_entity_error"
		internalCause = []
		status = 409
	}
}
