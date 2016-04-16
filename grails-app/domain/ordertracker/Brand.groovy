package ordertracker

class Brand {
  
  Long id
  String name
  String picture

  static constraints = {
    id nullable: false
    name nullable: false
    picture nullable: true
  }

  @Override
  String toString() {
    "Client[id:$id,name:$name,picture:$picture]"
  }
  
  @Override
  boolean equals(Object obj) {
    if (!(obj instanceof Client)) {
      return false
    }
    Client otherClient = (Client) obj

    this.id.equals(otherClient.id) &&
    this.name.equals(otherClient.name) &&
    this.picture.equals(otherClient.picture)
  }
  
  Map toJson() {
println "se invoca Brand.toJson"
    Map json = [:]
    json.id = this.id
    json.name = this.name
    json.picture = this.picture
    return json
  }

}
