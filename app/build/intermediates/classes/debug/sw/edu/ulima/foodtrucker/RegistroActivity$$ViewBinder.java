// Generated code from Butter Knife. Do not modify!
package sw.edu.ulima.foodtrucker;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegistroActivity$$ViewBinder<T extends sw.edu.ulima.foodtrucker.RegistroActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558539, "field 'ok'");
    target.ok = finder.castView(view, 2131558539, "field 'ok'");
    view = finder.findRequiredView(source, 2131558534, "field 'name'");
    target.name = finder.castView(view, 2131558534, "field 'name'");
    view = finder.findRequiredView(source, 2131558535, "field 'email'");
    target.email = finder.castView(view, 2131558535, "field 'email'");
    view = finder.findRequiredView(source, 2131558537, "field 'psw'");
    target.psw = finder.castView(view, 2131558537, "field 'psw'");
    view = finder.findRequiredView(source, 2131558536, "field 'user'");
    target.user = finder.castView(view, 2131558536, "field 'user'");
    view = finder.findRequiredView(source, 2131558522, "field 'profile_image'");
    target.profile_image = finder.castView(view, 2131558522, "field 'profile_image'");
  }

  @Override public void unbind(T target) {
    target.ok = null;
    target.name = null;
    target.email = null;
    target.psw = null;
    target.user = null;
    target.profile_image = null;
  }
}
