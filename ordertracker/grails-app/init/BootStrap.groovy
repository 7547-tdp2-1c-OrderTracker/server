import grails.converters.JSON
import grails.util.GrailsUtil

import ordertracker.Brand
import ordertracker.Client
import ordertracker.Product

class BootStrap {

	def grailsApplication

	def init = { servletContext ->

		// register marshaller
		JSON.registerObjectMarshaller(Date) {
			return it?.format("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
		}

		JSON.registerObjectMarshaller(Calendar) {
			return it?.getTime().format("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
		}


		// Carga inicial de los clientes
		def filePath = "resources/clients.json"
        def text = grailsApplication.getParentContext().getResource("classpath:$filePath").getInputStream().getText()
        def json = JSON.parse(text)

        for (element in json) {
        	new Client(element).save()
        }

        //Carga inicial de los productos
        filePath = "resources/products.json"
        text = grailsApplication.getParentContext().getResource("classpath:$filePath").getInputStream().getText()
        json = JSON.parse(text)

        for (element in json) {
        	new Product(element).save()
        }

        //Carga inicial de las brands
        filePath = "resources/brands.json"
        text = grailsApplication.getParentContext().getResource("classpath:$filePath").getInputStream().getText()
        json = JSON.parse(text)

        for (element in json) {
        	new Brand(element).save()
        }



		// print environment info
		println ">>>>>>>>>> BootStrap: "
		println ">>> Environment: " + GrailsUtil.environment
	}

	def destroy = {
		// shutdown scheduler
	}
}
