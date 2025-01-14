// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers {

  // @LINE:4
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReversePatientController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def newPatient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "newPatient")
    }
  
    // @LINE:10
    def filterByFullName(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "filterByFullName")
    }
  
    // @LINE:12
    def filterByAge(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "filterByAge")
    }
  
    // @LINE:14
    def resetFilters(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "resetFilters")
    }
  
  }


}
