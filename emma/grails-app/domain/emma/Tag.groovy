package emma

class Tag {

    String name

    static belongsTo = Task
    static hasMany = [tasks: Task]

    static constraints = {
        name blank: false, unique: true
    }

    String toString(){return name}

}
