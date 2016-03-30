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

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
