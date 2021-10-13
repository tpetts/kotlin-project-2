open class Student(name_param: String) {

    // Instance Variable
    var studentId: Int = 0
    // getter & setter for studentId
    get() = field
    set(value) {
        // if statement?
        if (value >= 0) {
            field = value
        }
    }

    // Instance Variable
    var name: String = ""
        // getter & setter for name
    get() = field
    set(value) {
        // if statement?
        if (value.isBlank()) {
            throw IllegalArgumentException("name cannot be blank")
        }
        field = value
    }

    init {
        name = name_param
        println("Student $name has been created!")
    }

    // Instance Variable
    var school: String = ""
        // getter & setter for school
        get() = field
        set(value) {
            // if statement?
            field = value
        }

    // Instance Variable
    var extracurricularActivities: String = ""
    // getter & setter for extracurricularActivities
    get() = field
    set(value) {
        // if statement?
        field = value
    }


    // Instance Variable
    var homeroomTeacher: String = ""
    // getter & setter for homeroomTeacher
    get() = field
    set(value) {
        // if statement?
        field = value
    }

    // This function will display the student's info
    open fun displayInfo(): String {
        return "$name has a student Id of $studentId and is in $extracurricularActivities. $name's Homeroom Teacher is $homeroomTeacher"
    }
}