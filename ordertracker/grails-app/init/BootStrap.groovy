import grails.converters.JSON
import grails.util.GrailsUtil

import ordertracker.Client

class BootStrap {

	def init = { servletContext ->

		// register marshaller
		JSON.registerObjectMarshaller(Date) {
			return it?.format("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
		}

		JSON.registerObjectMarshaller(Calendar) {
			return it?.getTime().format("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
		}

		JSON.registerObjectMarshaller(Client) {
			return it?.toString()
		}

		def client = new Client(id:123,name:"dario",lastname:"seminara",imagePath:"default.png",cuil:"234567",address:"calle fake 123",phone:"1234567",email:"darios3@gmail.com",latitude: 0,longitud: 0)
		client.save()

		// print environment info
		println ">>>>>>>>>> BootStrap: "
		println ">>> Environment: " + GrailsUtil.environment
	}

	def destroy = {
		// shutdown scheduler
	}
}
