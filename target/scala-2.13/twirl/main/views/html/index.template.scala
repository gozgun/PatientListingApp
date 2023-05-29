
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(patients: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Patient Listing Application")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>
      <h1>Add a New Patient</h1>
      <form action=""""),_display_(/*10.22*/routes/*10.28*/.PatientController.newPatient()),format.raw/*10.59*/("""" method="POST">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br>
      
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br>

        <label for="birthdate">Birthdate:</label>
        <input type="date" id="birthdate" name="birthdate" required><br>

        <label for="phoneNumber">Mobile phone number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="comments">Comments:</label>
        <input type="text" id="comments" name="comments"><br><br>
      
        <button type="submit">Add Patient</button>
        <input type="reset">
      </form>
      
      <br>

      <h1>Filter Patients</h1>

      <form action=""""),_display_(/*37.22*/routes/*37.28*/.PatientController.resetFilters()),format.raw/*37.61*/("""" method="POST">     
        <button type="submit">Clear All Filters</button>
      </form>
      <h2>By Name</h2>
      <form action=""""),_display_(/*41.22*/routes/*41.28*/.PatientController.filterByFullName()),format.raw/*41.65*/("""" method="POST">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>
      
        <button type="submit">Filter Patients</button>
        <input type="reset">
      </form>

      <h2>By Age</h2>
      <form action=""""),_display_(/*50.22*/routes/*50.28*/.PatientController.filterByAge()),format.raw/*50.60*/("""" method="POST">
        <label for="age">Age:</label>
        <input type="number" id="age" name="age"><br><br>
      
        <button type="submit">Filter Patients</button>
        <input type="reset">
      </form>


      <br><br>
      <h1>Patient List</h1>
      <table>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Birthdate</th>
          <th>Phone Number</th>
          <th>Email</th>
          <th>Comments</th>
        </tr>
        """),_display_(/*70.10*/for(patient <- patients.sortBy(_.lastName)) yield /*70.53*/ {_display_(Seq[Any](format.raw/*70.55*/("""
          """),format.raw/*71.11*/("""<tr>
            <td>"""),_display_(/*72.18*/patient/*72.25*/.firstName),format.raw/*72.35*/("""</td>
            <td>"""),_display_(/*73.18*/patient/*73.25*/.lastName),format.raw/*73.34*/("""</td>
            <td>"""),_display_(/*74.18*/patient/*74.25*/.birthdate),format.raw/*74.35*/("""</td>
            <td>"""),_display_(/*75.18*/patient/*75.25*/.phoneNumber),format.raw/*75.37*/("""</td>
            <td>"""),_display_(/*76.18*/patient/*76.25*/.email),format.raw/*76.31*/("""</td>
            <td>"""),_display_(/*77.18*/patient/*77.25*/.comments.getOrElse("")),format.raw/*77.48*/("""</td>
          </tr>
        """)))}),format.raw/*79.10*/("""
      """),format.raw/*80.7*/("""</table>
    </article>
  </div>
</section>
""")))}),format.raw/*84.2*/("""
""")))}))
      }
    }
  }

  def render(patients:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(patients)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (patients) => apply(patients)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: f64b8b11dd3f61c190255d0712227ae4b5277130
                  MATRIX: 743->1|869->34|896->36|939->71|978->73|1005->75|1052->114|1102->127|1130->129|1276->248|1291->254|1343->285|2299->1214|2314->1220|2368->1253|2532->1390|2547->1396|2605->1433|2896->1697|2911->1703|2964->1735|3477->2221|3536->2264|3576->2266|3615->2277|3664->2299|3680->2306|3711->2316|3761->2339|3777->2346|3807->2355|3857->2378|3873->2385|3904->2395|3954->2418|3970->2425|4003->2437|4053->2460|4069->2467|4096->2473|4146->2496|4162->2503|4206->2526|4268->2557|4302->2564|4377->2609
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|30->6|34->10|34->10|34->10|61->37|61->37|61->37|65->41|65->41|65->41|74->50|74->50|74->50|94->70|94->70|94->70|95->71|96->72|96->72|96->72|97->73|97->73|97->73|98->74|98->74|98->74|99->75|99->75|99->75|100->76|100->76|100->76|101->77|101->77|101->77|103->79|104->80|108->84
                  -- GENERATED --
              */
          