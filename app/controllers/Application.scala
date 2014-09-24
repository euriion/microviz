package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."));
  }

  public static Reuslt login() {
    return ok(login.render());
  }

}