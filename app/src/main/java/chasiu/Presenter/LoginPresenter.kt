package chasiu.Presenter
import chasiu.Model.Model
import chasiu.View.LoginView
import rx.Observable

/**
 * Created by Davix on 3/4/16.
 */
interface LoginPresenter {

    //Called by View
    //To Test onTakeView, associate a Mock view onto it
    //And check if the MockView gets called with the associated
    //Success and Error call backs

    fun onTakeView(view: LoginView)

    fun onUserEvent(event : Any) : Observable<Model.User>?
}
