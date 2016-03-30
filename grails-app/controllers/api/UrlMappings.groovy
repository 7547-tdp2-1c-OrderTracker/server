package api

class UrlMappings {

    static mappings = {
/*        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }*/
        "/clients" {
            controller = "clients"
            action = "list"
        }
        "/clients/$id" {
            controller = "clients"
            action = "get"
        }
        "/vendors/$vendor_id/clients" {
            controller = "clients"
            action = "vendor"
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
