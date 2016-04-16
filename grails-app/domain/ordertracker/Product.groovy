package ordertracker

class Product {

  Long id
  String name
  String brand
  Long brandId
  String description
  String thumbnail
  String picture
  Integer stock
  Double price
  String currency

	static constraints = {
    id nullable: false
    name nullable: false
    brand nullable: true
    brandId nullable: true
    description nullable: true
    thumbnail nullable: true
    picture nullable: true
    stock nullable: true
    price nullable: true
    currency nullable: true
	}


  @Override
  String toString() {
    "Product[id:$id,name:$name,brand:$brand,brandId:$brandId,description:$description,thumbnail:$thumbnail,picture:$picture,stock:$stock,price:$price,currency:$currency]"
  }
  
  @Override
  boolean equals(Object obj) {
    if (!(obj instanceof Product)) {
      return false
    }
    Product otherProduct = (Product) obj

    this.id.equals(otherProduct.id) &&
    this.name.equals(otherProduct.name) &&
    this.brand.equals(otherProduct.brand) &&
    this.brandId.equals(otherProduct.brandId) &&
    this.description.equals(otherProduct.description) &&
    this.thumbnail.equals(otherProduct.thumbnail) &&
    this.picture.equals(otherProduct.picture) &&
    this.stock.equals(otherProduct.stock) &&
    this.price.equals(otherProduct.price) &&
    this.currency.equals(otherProduct.currency)
  }
  
  Map toJson() {
    Map json = [:]
    json.id = this.id
    json.name = this.name
    json.brand = this.brand
    json.brand_id = this.brandId
    json.description = this.description
    json.thumbnail = this.thumbnail
    json.picture = this.picture
    json.stock = this.stock
    json.price = this.price
    json.currency = this.currency
    return json
  }

}
