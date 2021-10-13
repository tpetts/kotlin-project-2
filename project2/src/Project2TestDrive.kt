fun main() {

    // First Student
    val s1 = Kindergarten("Siti Khayriyyah")
    s1.studentId = 5
    s1.showAndTellItem = "centipedes"

    // unit test
    val expectedResult = "Siti Khayriyyah has a student id of 5 and is bringing centipedes for show and tell."
    val actualResult = s1.displayInfo()

    // unit test exception output values
    if (expectedResult == actualResult) {
        println("First Student test success")
    } else {
        println("First Student test failed")
    }

    // Second Student
    val s2 = Kindergarten("Spongebob Squarepants")
    s2.studentId = 6
    s2.showAndTellItem = "Gary the Snail"

    // unit test
    val expectedResult2 = "Spongebob Squarepants has a student id of 6 and is bringing Gary the Snail for show and tell."
    val actualResult2 = s2.displayInfo()

    // unit test exception output values
    if (expectedResult2 == actualResult2) {
        println("Second Student test success")
    } else {
        println("Second Student test failed")
    }

    // Third Student
    val s3 = Kindergarten("Patrick Star")
    s3.studentId = 7
    s3.showAndTellItem = "Bubbles"

    // unit test
    val expectedResult3 = "Patrick Star has a student id of 7 and is bringing Bubbles for show and tell."
    val actualResult3 = s3.displayInfo()

    // unit test exception output values
    if (expectedResult3 == actualResult3) {
        println("Third Student test success")
    } else {
        println("Third Student test failed")
    }

    // Array of Students
    val studentArray = arrayOf(s1, s2, s3)

    // Iterating over the array of students, and displaying information for each student
    for (item in studentArray) {
        item.displayInfo()
    }

    // Part 2
    var stillLoop = true
    val studentObjectArray = arrayListOf<MasterStudent>()

    while (stillLoop) {
        println("Do you want to enter Student Information? (Y/N) ")
        val input: String? = readLine()
        if (input == "Y") {
            // Capturing new student information
            println("What is the Student's First Name? ")
            val enterFirstName: String? = readLine()
            if (enterFirstName.isNullOrBlank()) {
                println("A first name wasn't entered. Starting over ...")
                break
            }
            // student last name
            println("What is the Student's Last Name? ")
            val enterLastName: String? = readLine()
            if (enterLastName.isNullOrBlank()) {
                println("A last name wasn't entered. Starting over ...")
                break
            }
            // student's teacher
            println("Who is the Student's Teacher? ")
            val enterTeacher: String? = readLine()
            if (enterTeacher.isNullOrBlank()) {
                println("A teacher wasn't entered. Starting over ...")
                break
            }
            //what kind of student
            //ask the grade of the student
            println("What grade level is the Student in? (K-12) ")

            val student: MasterStudent = when (val enterGradeLevel: String? = readLine()) {
                "K", "1", "2", "3", "4", "5" -> processElementaryStudent(enterFirstName, enterLastName, enterTeacher, enterGradeLevel)
                "6", "7","8"  -> processMiddleSchoolStudent(enterFirstName, enterLastName, enterTeacher, enterGradeLevel)// favorite color
                "9", "10", "11", "12" -> processHighSchoolStudent(enterFirstName, enterLastName, enterTeacher, enterGradeLevel) // favorite lunch
                else -> println("A valid grade wasn't entered. Starting over ...")
            } as MasterStudent

            if (student != null) {
                studentObjectArray.add(student)
            }
            // if they are in elementary --> who is your favorite teacher?
            // if they are in Middleschool --> who is your favorite class?
            // if they are in Highschool --> what is your favorite lunch?


            // once student information is captured, store new information in an array
        } else { // exit out of the loop
            stillLoop = false
            for (item in studentObjectArray) {
                item.getStudentInfo()
                item.runStudentProgressReport()
                item.getTestResults()
                item.takeTest()
                println("\n\n")
            }

            // iterate over number of students in array and display each of the student's information
        }
    }

}

inline fun processElementaryStudent(firstName: String, lastName: String, teacher: String, grade: String): MasterStudent? {
    val student: ElementarySchoolStudent = ElementarySchoolStudent(firstName,lastName)
    student.teacher = teacher
    student.grade = grade
    println("Who is your favorite teacher?")
    val enterFavoriteTeacher: String? = readLine()
    if (enterFavoriteTeacher.isNullOrBlank()) {
        println("A teacher wasn't entered. Starting over ...")
        return null
    }
    student.favoriteTeacher = enterFavoriteTeacher
    return student
}

inline fun processMiddleSchoolStudent(firstName: String, lastName: String, teacher: String, grade: String): MasterStudent? {
    val student: MiddleSchoolStudent = MiddleSchoolStudent(firstName,lastName)
    student.teacher = teacher
    student.grade = grade
    println("What is your favorite Class?")
    val enterFavoriteClass: String? = readLine()
    if (enterFavoriteClass.isNullOrBlank()) {
        println("A class wasn't entered. Starting over ...")
        return null
    }
    student.favoriteClass = enterFavoriteClass
    return student
}

inline fun processHighSchoolStudent(firstName: String, lastName: String, teacher: String, grade: String): MasterStudent? {
    val student: HighSchoolStudent = HighSchoolStudent(firstName,lastName)
    student.teacher = teacher
    student.grade = grade
    println("What is your favorite lunch?")
    val enterFavoriteLunch: String? = readLine()
    if (enterFavoriteLunch.isNullOrBlank()) {
        println("Nothing was entered; That's not a lunch, silly! Starting over ...")
        return null
    }
    student.favoriteLunch = enterFavoriteLunch
    return student
}