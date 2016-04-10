class UrlMappings {

    static mappings = {

        "/v1/products"(controller: "product"){
            action = [GET: "list"]
        }

        "/v1/products/$id"(controller: "product"){
            action = [GET: "get", POST: "create", PUT: "update"]
        }

        "/v1/clients"(controller: "client"){
            action = [GET: "list"]
        }

        "/v1/clients/$id"(controller: "client"){
            action = [GET: "get", POST: "create", PUT: "update"]
        }


        "/v1/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
