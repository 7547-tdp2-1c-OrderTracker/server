package ordertracker

import grails.test.mixin.TestFor
import spock.lang.Specification
import ordertracker.Client

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ClientController)
class ClientControllerSpec extends Specification {

    def setup() {
    }


    def cleanup() {
    }


    void "client creation"() {
    	when:"creating client"
    		def client = new Client(id:123,name:"dario",lastname:"seminara",imagePath:"default.png",cuil:"234567",address:"calle fake 123",phone:"1234567",email:"darios3@gmail.com",latitude: 0,longitud: 0)

		then:"client created"
			assert client.id == 123
			assert client.name == 'dario'
			assert client.lastname == 'seminara'
			assert client.imagePath == 'default.png'
			assert client.cuil == '234567'
			assert client.address == 'calle fake 123'
			assert client.phone == '1234567'
			assert client.email == 'darios3@gmail.com'
			assert client.latitude == 0
			assert client.longitud == 0
    }
}
