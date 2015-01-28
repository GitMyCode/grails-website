navigation = {
    // Declare the "app" scope, used by default in tags
    app {

        // A nav item pointing to HomeController, using the default action
        home()

        // Items pointing to ContentController, using the specific action
        about()
        contact()
        help()

        login(action: 'auth')
        logout()
        tag(visible: false)
        task(visible: false)
        // Some user interface actions in second-level nav
        // All in BooksController

        // More convoluted stuff split across controllers/locations
    }

    // Some back-end admin scaffolding stuff in a separate scope

}