class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'opinion', action: 'opinionFeed')
        "500"(view:'/error')
	}
}
