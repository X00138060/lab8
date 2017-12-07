
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>

  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
    """),format.raw/*8.5*/("""<div class = "alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""</div>
  """)))}),format.raw/*11.4*/("""
  
  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
    <!-- The header row-->
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Stock</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody> 
    <!-- Product row(s) -->
    """),_display_(/*26.6*/for(p<-products) yield /*26.22*/ {_display_(Seq[Any](format.raw/*26.24*/("""
      """),format.raw/*27.7*/("""<tr>
        <td class = "id">"""),_display_(/*28.27*/p/*28.28*/.getId),format.raw/*28.34*/("""</td>
        <td>"""),_display_(/*29.14*/p/*29.15*/.getName),format.raw/*29.23*/("""</td>
        <td>"""),_display_(/*30.14*/p/*30.15*/.getDescription),format.raw/*30.30*/("""</td>
        <td>"""),_display_(/*31.14*/p/*31.15*/.getStock),format.raw/*31.24*/("""</td>
        <td>&euro; """),_display_(/*32.21*/("%,.2f".format(p.getPrice))),format.raw/*32.49*/("""</td>
      </tr>
    """)))}),format.raw/*34.6*/("""
    """),format.raw/*35.5*/("""</tbody>
  </table>

  <p>
    <a href=""""),_display_(/*39.15*/routes/*39.21*/.HomeController.addProduct()),format.raw/*39.49*/("""">
      <button class="btn btn-primary">Add a Product</button>
    </a>
  </p>
  
  """)))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 07 13:16:00 GMT 2017
                  SOURCE: /media/sf_student/lab8/app/views/index.scala.html
                  HASH: 9cade7640ce8415caca317c5d232569795d59a51
                  MATRIX: 962->1|1089->33|1119->38|1148->59|1187->61|1221->69|1290->113|1330->145|1369->147|1401->153|1470->197|1483->202|1518->217|1551->223|1592->234|1627->242|1969->558|2001->574|2041->576|2076->584|2135->616|2145->617|2172->623|2219->643|2229->644|2258->652|2305->672|2315->673|2351->688|2398->708|2408->709|2438->718|2492->745|2541->773|2596->798|2629->804|2701->849|2716->855|2765->883
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|58->26|58->26|58->26|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|66->34|67->35|71->39|71->39|71->39
                  -- GENERATED --
              */
          