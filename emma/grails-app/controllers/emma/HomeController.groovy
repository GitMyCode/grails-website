package emma

class HomeController {


    def index() {[posts: emma.Post.all]}
}
