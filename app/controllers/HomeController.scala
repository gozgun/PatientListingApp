package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.PatientMemoryModel
import models.Product


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request =>
    val patients = PatientMemoryModel.getFilteredPatients()
    Ok(views.html.index(patients))
  }
}
