package io.udash.demos.rest.views.book

import io.udash._
import io.udash.demos.rest.PhoneBookFormState
import io.udash.demos.rest.model.PhoneBookId

case class PhoneBookFormViewFactory(id: Option[PhoneBookId]) extends ViewFactory[PhoneBookFormState] {
  override def create(): (View, Presenter[PhoneBookFormState]) = {
    val model = ModelProperty(PhoneBookEditorModel()) // use default values defined in model
    val presenter = new PhoneBookFormPresenter(model)
    val view = new PhoneBookFormView(model, presenter)
    (view, presenter)
  }
}
