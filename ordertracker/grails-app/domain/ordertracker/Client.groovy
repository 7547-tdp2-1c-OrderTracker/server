package ordertracker

class Client {

  static mapping = {
    table 'client'
  }
  
  Long id
  String name
  String lastname
  String imagePath
  String cuil
  String address
  String phone
  String email
  Double latitude
  Double longitud

	static constraints = {
    id nullable: false
    name nullable: false
    lastname nullable: false
    imagePath nullable: true
    cuil nullable: true
    address nullable: true
    phone nullable: true
    email nullable: true
    latitude nullable: true
    longitud nullable: true
	}

  @Override
  String toString() {
    "Client[id:$id,name:$name,lastname:$lastname,imagePath:$imagePath,cuil:$cuil,address:$address,phone:$phone,email:$email,latitude:$latitude,longitud:$longitud]"
  }
  
  @Override
  boolean equals(Object obj) {
    if (!(obj instanceof Client)) {
      return false
    }
    Client otherClient = (Client) obj

    this.id.equals(otherClient.id) &&
    this.name.equals(otherClient.name) &&
    this.lastname.equals(otherClient.lastname) &&
    this.imagePath.equals(otherClient.imagePath) &&
    this.cuil.equals(otherClient.cuil) &&
    this.address.equals(otherClient.address) &&
    this.phone.equals(otherClient.phone) &&
    this.email.equals(otherClient.email) &&
    this.latitude.equals(otherClient.latitude,) &&
    this.longitud.equals(otherClient.longitud)
  }
  
  Map toJson() {
    Map json = [:]
    json.id = this.id
    json.name = this.name
    json.lastname = this.lastname
    json.image_path = this.imagePath
    json.cuil = this.cuil
    json.address = this.address
    json.phone = this.phone
    json.email = this.email
    json.latitude = this.latitude
    json.longitud = this.longitud
    return json
  }

}
