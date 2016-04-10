package ordertracker.exception

import org.apache.commons.logging.LogFactory

abstract class OrderTrackerException extends RuntimeException {

	def internalCause
	def error
	def status
	def log = LogFactory.getLog(getClass())
	
	OrderTrackerException(String message, Boolean logError = true) {
		super(message)
		setDefaultValues()
		if (logError) log.error(message, this)
	}

	Map getResponseMap() {
		["message":message, "error":error, "cause":internalCause, "status":status]
	}
	
	static String getNameForClass(String fullName) {
		int lastIndex = fullName?.lastIndexOf(".")
		int length = fullName?.size()
		fullName?.substring(lastIndex+1, length)
	}
	
	static String getNameForClass(def errors) {
		String fullName = errors?.target?.getClass()?.getName()
		getNameForClass(fullName)
	}
	
	abstract void setDefaultValues()
}