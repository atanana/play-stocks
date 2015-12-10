
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andrey/dev/IdeaProjects/scala/stocks/conf/routes
// @DATE:Thu Dec 10 22:56:22 MSK 2015


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
