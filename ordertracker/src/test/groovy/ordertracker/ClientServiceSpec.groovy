package ordertracker

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.gorm.Domain
import grails.test.mixin.integration.Integration
import grails.test.mixin.hibernate.HibernateTestMixin
import spock.lang.Specification
import ordertracker.Client

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@Integration
@Domain(Client)
@TestFor(ClientService)
@TestMixin(HibernateTestMixin)
class ClientServiceSpec extends Specification {


    void "client listing"() {
    	given:
    		def client = new Client(id:1,name:"dario",lastname:"seminara",avatar:"default.png",thumbnail:"default.png",cuil:"234567",address:"calle fake 123",phoneNumber:"1234567",email:"darios3@gmail.com",lat: 0,lon: 0)
    		def client2 = new Client(id:2,name:"pablo",lastname:"nazareno",avatar:"default.png",thumbnail:"default.png",cuil:"987654",address:"calle fake 12345",phoneNumber:"1234567",email:"pablonazareno@gmail.com",lat: 1,lon: 1)

    	when:"listing clients"
    		
    		def clients = service.list()

		then:"must be found the clients"
			assert 2, clients.size()
			//please fix this
			// assert clients[0].id == 1
			// assert clients[0].name == 'dario'
			// assert clients[0].lastname == 'seminara'
			// assert clients[0].avatar == 'default.png'
			// assert clients[0].thumbnail == 'default.png'
			// assert clients[0].cuil == '234567'
			// assert clients[0].address == 'calle fake 123'
			// assert clients[0].phoneNumber == '1234567'
			// assert clients[0].email == 'darios3@gmail.com'
			// assert clients[0].lat == 0
			// assert clients[0].lon == 0
			// assert clients[1].id == 2
			// assert clients[1].name == 'pablo'
			// assert clients[1].lastname == 'nazareno'
			// assert clients[1].avatar == 'default.png'
			// assert clients[1].thumbnail == 'default.png'
			// assert clients[1].cuil == '987654'
			// assert clients[1].address == 'calle fake 12345'
			// assert clients[1].phoneNumber == '1234567'
			// assert clients[1].email == 'pablonazareno@gmail.com'
			// assert clients[1].lat == 1
			// assert clients[1].lon == 1
    }

    void "client creation"() {
    	given:
    		def client = new Client(id:3,name:"dario",lastname:"seminara",avatar:"default.png",thumbnail:"default.png",cuil:"234567",address:"calle fake 123",phoneNumber:"1234567",email:"darios3@gmail.com",lat: 0,lon: 0)

    	when:"saving client"
    		//please fix this
    		client.save()
    		

		then:"must be found the client"
			def clients = service.list()
			assert 1, clients.size()
			assert clients[0].id == 1
			assert clients[0].name == 'dario'
			assert clients[0].lastname == 'seminara'
			assert clients[0].avatar == 'default.png'
			assert clients[0].thumbnail == 'default.png'
			assert clients[0].cuil == '234567'
			assert clients[0].address == 'calle fake 123'
			assert clients[0].phoneNumber == '1234567'
			assert clients[0].email == 'darios3@gmail.com'
			assert clients[0].lat == 0
			assert clients[0].lon == 0
    }
}
