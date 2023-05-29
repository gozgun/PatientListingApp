package models

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import collection.mutable

// Stores the patient info
case class Product(firstName: String, lastName: String, birthdate: LocalDate, phoneNumber: String, email: String, comments: Option[String])


object PatientMemoryModel {
    private val Patients: mutable.Map[Int, Product] = mutable.Map() // Stores ID as key and patient info as value under Product
    private var ActiveList: List[Product] = List.empty // Stores the current patient list, it changes as filters applied / removed
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd") // USed in String -> LocalDate conversion


    // Adds a new patient with the given information
    def newPatient(firstName: String, lastName: String, birthdateStr: String, phoneNumber: String, email: String, comments: Option[String]) : Unit = {
        val newId = Patients.size + 1 // Create a unique new ID
        val birthdate = LocalDate.parse(birthdateStr, formatter) // Convert String type to LocalDate
        val newPatient = Product(firstName, lastName, birthdate, phoneNumber, email, comments)
        Patients += (newId -> newPatient) // Add the patient info to the memory model
        noFilter() // To display changes reset the filters
    }


    // Clears all filters
    def noFilter() : Unit = {
        ActiveList = Patients.values.toList // Set the ActiveList to the memory model
    }


    // Filters by a query, a patient's first name or last name starts with the query, it is kept in ActiveList
    def filterByFullName(searchQuery: String) : Unit = {
        val queryWords = searchQuery.toLowerCase.split(" ")

        ActiveList = Patients.values.filter { patient =>
            val fullName = patient.firstName.toLowerCase + " " + patient.lastName.toLowerCase
            queryWords.forall { word =>
            fullName.split(" ").exists(_.startsWith(word))
            }
        }.toList
    }


    // Filters by a query, a patient's age is equal to the query at the time of filtering, it is kept in ActiveList
    def filterByAge(searchQuery: Int): Unit = {
        val currentDate = LocalDate.now()
        
        ActiveList = Patients.values.filter { patient =>
            val years = ChronoUnit.YEARS.between(patient.birthdate, currentDate).toInt
            years == searchQuery
        }.toList
    }


    // Returns the current ActiveList
    def getFilteredPatients(): List[Product] = {
        ActiveList
    }
}