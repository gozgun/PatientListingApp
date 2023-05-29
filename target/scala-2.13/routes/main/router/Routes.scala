// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  HomeController_0: controllers.HomeController,
  // @LINE:6
  Assets_1: controllers.Assets,
  // @LINE:8
  PatientController_2: controllers.PatientController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    HomeController_0: controllers.HomeController,
    // @LINE:6
    Assets_1: controllers.Assets,
    // @LINE:8
    PatientController_2: controllers.PatientController
  ) = this(errorHandler, HomeController_0, Assets_1, PatientController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, PatientController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newPatient""", """controllers.PatientController.newPatient()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filterByFullName""", """controllers.PatientController.filterByFullName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filterByAge""", """controllers.PatientController.filterByAge()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetFilters""", """controllers.PatientController.resetFilters()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PatientController_newPatient2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newPatient")))
  )
  private[this] lazy val controllers_PatientController_newPatient2_invoker = createInvoker(
    PatientController_2.newPatient(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "newPatient",
      Nil,
      "POST",
      this.prefix + """newPatient""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PatientController_filterByFullName3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filterByFullName")))
  )
  private[this] lazy val controllers_PatientController_filterByFullName3_invoker = createInvoker(
    PatientController_2.filterByFullName(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "filterByFullName",
      Nil,
      "POST",
      this.prefix + """filterByFullName""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PatientController_filterByAge4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filterByAge")))
  )
  private[this] lazy val controllers_PatientController_filterByAge4_invoker = createInvoker(
    PatientController_2.filterByAge(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "filterByAge",
      Nil,
      "POST",
      this.prefix + """filterByAge""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PatientController_resetFilters5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetFilters")))
  )
  private[this] lazy val controllers_PatientController_resetFilters5_invoker = createInvoker(
    PatientController_2.resetFilters(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "resetFilters",
      Nil,
      "POST",
      this.prefix + """resetFilters""",
      """""",
      Seq("""nocsrf""")
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:6
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:8
    case controllers_PatientController_newPatient2_route(params@_) =>
      call { 
        controllers_PatientController_newPatient2_invoker.call(PatientController_2.newPatient())
      }
  
    // @LINE:10
    case controllers_PatientController_filterByFullName3_route(params@_) =>
      call { 
        controllers_PatientController_filterByFullName3_invoker.call(PatientController_2.filterByFullName())
      }
  
    // @LINE:12
    case controllers_PatientController_filterByAge4_route(params@_) =>
      call { 
        controllers_PatientController_filterByAge4_invoker.call(PatientController_2.filterByAge())
      }
  
    // @LINE:14
    case controllers_PatientController_resetFilters5_route(params@_) =>
      call { 
        controllers_PatientController_resetFilters5_invoker.call(PatientController_2.resetFilters())
      }
  }
}
