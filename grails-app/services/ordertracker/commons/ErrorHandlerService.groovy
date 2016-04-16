package ordertracker.commons

import grails.util.GrailsUtil

class ErrorHandlerService {

	static transactional = false

	Map exProcessors = [:]

	ErrorHandlerService(){
		Closure commonClosure = { ex ->
			Map responseContent = [:]
			Integer statusCode = ex.status
			responseContent.message = ex.message
			responseContent.status = statusCode
			responseContent.error = ex.error
			responseContent.cause = ex.cause
			return [response:responseContent, status:statusCode]
		}
		exProcessors[java.lang.IllegalArgumentException] = { ex ->
			Map responseContent = [:]
			Integer statusCode = 400
			responseContent.message = ex.getMessage()
			responseContent.status = statusCode
			responseContent.error = "Bad request"
			responseContent.cause = ex.getCause()
			return [response:responseContent, status:statusCode]
		}
		exProcessors[java.lang.Exception] = { ex ->
			Map responseContent = [:]
			Integer statusCode = 500
			responseContent.message = ex.getMessage()
			responseContent.status = statusCode
			responseContent.error = "Internal Error"
			responseContent.cause = ex.getCause()
			return [response:responseContent, status:statusCode]
		}
	}

	/**
	 * Genera el map de errores de acuerdo al tipo de exception
	 */
	Map handleException(Exception exception) {
		if(exProcessors[exception?.getClass()]) {
			return exProcessors[exception.getClass()](exception)
		} else {
			log.error(exception?.getMessage(), exception)
			Map responseContent = [:]
			Integer statusCode = 500
			responseContent.error = "Internal Error"
			responseContent.status = statusCode
			responseContent.message = "no specific handler defined for this exception ${exception?.getClass()}"
			responseContent.detailed_info = GrailsUtil.sanitize(exception)
			return [response:responseContent, status:statusCode]
		}
	}
}
