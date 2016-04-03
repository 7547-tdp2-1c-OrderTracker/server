package api

class UrlMappings {

    static mappings = {
/*        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }*/
        "/v1/clients" {
            controller = "clients"
            action = "list"
        }
        "/v1/clients/$id" {
            controller = "clients"
            action = "get"
        }
        "/v1/vendors/$vendor_id/clients" {
            controller = "clients"
            action = "vendor"
        }
        "/v1/clients/seed" {
            controller = "clients"
            action = "seed"
        }

        "/v1/products" {
            controller = "products"
            action = "list"
        }
        "/v1/products/$id" {
            controller = "products"
            action = "get"
        }


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
