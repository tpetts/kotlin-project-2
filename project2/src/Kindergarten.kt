class Kindergarten(name_param: String) : Student(name_param) {

    // Instance Variable
    var showAndTellItem: String = ""
        // getter & setter for extracurricularActivities
        get() {
            return field
        }
        set(value) {
            // if statement
            field = value
        }
    override fun displayInfo(): String {
    // information about the kindergarten students here
        // label the student as a kindergarten student and include the show and tell item
        return "$name has a student id of $studentId and is bringing $showAndTellItem for show and tell."
    }
}