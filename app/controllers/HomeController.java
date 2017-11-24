package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        List<Product> p = Product.findAll();
        return ok(index.render(p));
    }

}
