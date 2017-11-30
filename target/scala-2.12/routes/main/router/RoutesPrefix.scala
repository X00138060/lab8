
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/play-java-seed/conf/routes
// @DATE:Thu Nov 30 13:28:31 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
