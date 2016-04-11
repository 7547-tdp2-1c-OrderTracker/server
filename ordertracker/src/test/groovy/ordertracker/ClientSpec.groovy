package ordertracker

import grails.test.mixin.TestFor
import org.junit.*
import spock.lang.Specification
import ordertracker.Client

/**
 *
 */
@TestFor(Client)
class ClientSpec extends Specification {

    void "client creation"() {
    	when:"creating client"
    		def client = new Client(id:123,name:"dario",lastname:"seminara",avatar:"default.png",thumbnail:"default.png",cuil:"234567",address:"calle fake 123",phoneNumber:"1234567",email:"darios3@gmail.com",lat: 0,lon: 0)

		then:"client created"
			assert client.id == 123
			assert client.name == 'dario'
			assert client.lastname == 'seminara'
            assert client.avatar == 'default.png'
			assert client.thumbnail == 'default.png'
			assert client.cuil == '234567'
			assert client.address == 'calle fake 123'
			assert client.phoneNumber == '1234567'
			assert client.email == 'darios3@gmail.com'
			assert client.lat == 0
			assert client.lon == 0
    }

    void "test constraints"() {

    	when:"creating client"
    		def client = new Client(id:123,name:"dario",lastname:"seminara")
    	then:
			assert true, client.validate()
    }

    void "test equals"() {
    	when:"two clents has same attributes"
    		Client c1 = new Client(id:123,name:"dario",lastname:"seminara",avatar:"default.png",thumbnail:"default.png",cuil:"234567",address:"calle fake 123",phoneNumber:"1234567",email:"darios3@gmail.com",lat: 0,lon: 0)
    		Client c2 = new Client(id:123,name:"dario",lastname:"seminara",avatar:"default.png",thumbnail:"default.png",cuil:"234567",address:"calle fake 123",phoneNumber:"1234567",email:"darios3@gmail.com",lat: 0,lon: 0)
    	then:"must be equals"
    		assert true, c1.equals(c2)
    }
}
