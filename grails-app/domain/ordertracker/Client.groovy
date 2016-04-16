package ordertracker

class Client {

  static mapping = {
    table 'client'
  }
  
  Long id
  String name
  String lastname
  String avatar
  String thumbnail
  String cuil
  String address
  String phoneNumber
  String email
  Double lat
  Double lon

	static constraints = {
    id nullable: false
    name nullable: false
    lastname nullable: false
    avatar nullable: true
    thumbnail nullable: true
    cuil nullable: true
    address nullable: true
    phoneNumber nullable: true
    email nullable: true
    lat nullable: true
    lon nullable: true
	}

  @Override
  String toString() {
    "Client[id:$id,name:$name,lastname:$lastname,avatar:$avatar,thumbnail:$thumbnail,cuil:$cuil,address:$address,phoneNumber:$phoneNumber,email:$email,lat:$lat,lon:$lon]"
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
    this.avatar.equals(otherClient.avatar) &&
    this.thumbnail.equals(otherClient.thumbnail) &&
    this.cuil.equals(otherClient.cuil) &&
    this.address.equals(otherClient.address) &&
    this.phoneNumber.equals(otherClient.phoneNumber) &&
    this.email.equals(otherClient.email) &&
    this.lat.equals(otherClient.lat,) &&
    this.lon.equals(otherClient.lon)
  }
  
  Map toJson() {
    Map json = [:]
    json.id = this.id
    json.name = this.name
    json.lastname = this.lastname
    json.avatar = this.avatar
    json.thumbnail = this.thumbnail
    json.cuil = this.cuil
    json.address = this.address
    json.phone_number = this.phoneNumber
    json.email = this.email
    json.lat = this.lat
    json.lon = this.lon
    return json
  }

}
