package emma

class Post {


    String title
    String content



    static constraints = {
        content type: "text", sqlType: 'clob' , maxSize: 2000
    }
}
