
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
  
  <table class="table table-bordered table-hover table-condensed">
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
    """),_display_(/*20.6*/for(p<-products) yield /*20.22*/ {_display_(Seq[Any](format.raw/*20.24*/("""
      """),format.raw/*21.7*/("""<tr>
        <td class = "id">"""),_display_(/*22.27*/p/*22.28*/.getId),format.raw/*22.34*/("""</td>
        <td>"""),_display_(/*23.14*/p/*23.15*/.getName),format.raw/*23.23*/("""</td>
        <td>"""),_display_(/*24.14*/p/*24.15*/.getDescription),format.raw/*24.30*/("""</td>
        <td>"""),_display_(/*25.14*/p/*25.15*/.getStock),format.raw/*25.24*/("""</td>
        <td>&euro; """),_display_(/*26.21*/("%,.2f".format(p.getPrice))),format.raw/*26.49*/("""</td>
      </tr>
    """)))}),format.raw/*28.6*/("""
    """),format.raw/*29.5*/("""</tbody>
  </table>
  
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
                  DATE: Thu Nov 30 13:28:32 GMT 2017
                  SOURCE: /media/sf_student/play-java-seed/app/views/index.scala.html
                  HASH: 27ed334168e7458dc32c4f4692dbeefdd8944aec
                  MATRIX: 962->1|1089->33|1119->38|1148->59|1187->61|1221->69|1608->430|1640->446|1680->448|1715->456|1774->488|1784->489|1811->495|1858->515|1868->516|1897->524|1944->544|1954->545|1990->560|2037->580|2047->581|2077->590|2131->617|2180->645|2235->670|2268->676
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|60->28|61->29
                  -- GENERATED --
              */
          