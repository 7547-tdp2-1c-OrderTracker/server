package ordertracker

class Product {

  Long id
  String categoryId
  String brandId
  String name
  String code
  String imagePath
  String description
  String stock
  String status
  Double retailPrice
  Double wholesalePrice

	static constraints = {
    id nullable: false
    categoryId nullable: false
    brandId nullable: false
    name nullable: false
    code nullable: false
    imagePath nullable: true
    description nullable: false
    stock nullable: false
    status nullable: false
    retailPrice nullable: true
    wholesalePrice nullable: true
	}

  @Override
  String toString() {
    "Product[id:$id,categoryId:$categoryId,brandId:$brandId,name:$name,code:$code,imagePath:$imagePath,description:$description,stock:$stock,status:$status,retailPrice:$retailPrice,wholesalePrice:$wholesalePrice]"
  }
  
  @Override
  boolean equals(Object obj) {
    if (!(obj instanceof Product)) {
      return false
    }
    Product otherProduct = (Product) obj

    this.id.equals(otherProduct.id) &&
    this.categoryId.equals(otherProduct.categoryId) &&
    this.brandId.equals(otherProduct.brandId) &&
    this.name.equals(otherProduct.name) &&
    this.code.equals(otherProduct.code) &&
    this.imagePath.equals(otherProduct.imagePath) &&
    this.description.equals(otherProduct.description) &&
    this.stock.equals(otherProduct.stock) &&
    this.status.equals(otherProduct.status) &&
    this.retailPrice.equals(otherProduct.retailPrice) &&
    this.wholesalePrice.equals(otherProduct.wholesalePrice)
  }
  
  Map toJson() {
    Map json = [:]
    json.id = this.id
    json.category_id = this.categoryId
    json.brand_id = this.brandId
    json.name = this.name
    json.code = this.code
    json.image_path = this.imagePath
    json.description = this.description
    json.stock = this.stock
    json.status = this.status
    json.retail_price = this.retailPrice
    json.wholesale_price = this.wholesalePrice
    return json
  }

}
