abstract class MasterStudent : TestTaker {
    abstract val firstName: String
    abstract val lastName: String
    abstract var grade: String
    abstract var teacher: String

    abstract fun runStudentProgressReport()
    abstract fun getStudentInfo()
    override fun takeTest() {
        println("Student $firstName is taking a test")
    }

    override fun getTestResults(): String {
        return("Student $firstName's test grade is: $grade")
    }
}