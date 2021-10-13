class HighSchoolStudent(firstName_param: String, lastName_param: String) : MasterStudent() {
    override val firstName: String = firstName_param
        get() {
            return field
        }
    override val lastName: String = lastName_param
        get() {
            return field
        }
    override var grade: String = "A"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    override var teacher: String = "Ms. Arnold"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var favoriteLunch: String = "Pizza"
        get() {
            return field
        }
        set(value) {

            field = value
        }

    override fun runStudentProgressReport() {
        println("Student $firstName is doing a great job.")
    }

    override fun takeTest() {
        println("Student $firstName is taking a test. No cell phones, and no calculators allowed.")
    }

    override fun getTestResults(): String {
        return("$firstName's test grade is: $grade")
    }

    override fun getStudentInfo() {
        println("Student $firstName $lastName will be in $teacher's class, and will be in grade $grade.\n" +
                "$firstName's favorite lunch is: $favoriteLunch.")
    }

}