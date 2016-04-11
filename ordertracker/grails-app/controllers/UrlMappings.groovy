class UrlMappings {

    static mappings = {

        "/v1/products"(controller: "product"){
            action = [GET: "list"]
        }

        "/v1/product/$id?"(controller: "product"){
            action = [GET: "get", POST: "create", PUT: "update", DELETE: "delete"]
        }

        "/v1/clients"(controller: "client"){
            action = [GET: "list"]
        }

        "/v1/client/$id?"(controller: "client"){
            action = [GET: "get", POST: "create", PUT: "update", DELETE: "delete"]
        }

        "/v1/brands"(controller: "brand"){
            action = [GET: "list"]
        }

        "/v1/brand/$id?"(controller: "brand"){
            action = [GET: "get", POST: "create", PUT: "update", DELETE: "delete"]
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
