package controllers

import play.api.mvc._
import javax.inject._
import models.PatientMemoryModel
import models.Product

class PatientController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  // Parses the request body to get the new patient information and calls PatientMemoryModel.newPatient(...)
  // then redirects to the home page to display the changes.
  def newPatient(): Action[AnyContent] = Action { request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.fold[Result](Redirect(routes.HomeController.index())) { args =>
      val firstName = args("firstName").head
      val lastName = args("lastName").head
      val birthdate = args("birthdate").head
      val phoneNumber = args("phoneNumber").head
      val email = args("email").head
      val comments = args.get("comments").flatMap(_.headOption)

      PatientMemoryModel.newPatient(firstName, lastName, birthdate, phoneNumber, email, comments)

      Redirect(routes.HomeController.index())
    }
  }
  

  // Parses the request body to get the query word and calls PatientMemoryModel.filterByFullName(...)
  // then redirects to the home page to display the changes.
  def filterByFullName(): Action[AnyContent] = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.fold[Result](Redirect(routes.HomeController.index())) { args =>
      val name = args("name").head

      PatientMemoryModel.filterByFullName(name)

      Redirect(routes.HomeController.index())
    }


  }


  // Parses the request body to get the query word and calls PatientMemoryModel.filterByAge(...)
  // then redirects to the home page to display the changes.
  def filterByAge(): Action[AnyContent] = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.fold[Result](Redirect(routes.HomeController.index())) { args =>
      val age = args("age").head.toInt

      val filteredPatients = PatientMemoryModel.filterByAge(age)

      Redirect(routes.HomeController.index())
    }
  }


  // Invoked when the user clicks on Clear Filters
  def clearFilters(): Action[AnyContent] = Action { implicit request =>
    PatientMemoryModel.noFilter()
    Redirect(routes.HomeController.index())
  }
}
