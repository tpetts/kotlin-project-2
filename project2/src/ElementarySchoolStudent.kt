class ElementarySchoolStudent(firstName_param: String, lastName_param: String) : MasterStudent() {
    override val firstName: String = firstName_param
        get() {
            return field
        }
//        set(value) =
    override val lastName: String = lastName_param
        get() {
            return field
        }
//        set(value) {
//            field = value
//        }
            override var grade: String = "A"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    override var teacher: String = "Mrs. Puff"
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var favoriteTeacher: String = "Mr. Krabbs"
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun runStudentProgressReport() {
        println("Student $firstName is making good progress.")
    }

    override fun takeTest() {
        println("Student $firstName is taking a test. Calculators are allowed.")
    }

    override fun getTestResults(): String {
        return("$firstName's test grade is: $grade")
    }

    override fun getStudentInfo() {
        println("Student $firstName $lastName will be in $teacher's class, and will be in grade $grade.\n" +
                "$firstName's favorite teacher is: $favoriteTeacher.")
    }


}