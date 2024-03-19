package com.example.myapplication

class Presenter {

      lateinit var  m_view:model_view
      lateinit var model: TaskModel
      constructor(view:model_view)
      {
          this.m_view = view
      }

    fun Add_Data_to_model():TaskModel
    {
        model.id="12345"
        model.name="Alaa"
        model.address="fayoum"
        return model
    }
    fun Get_model():TaskModel{
        return Add_Data_to_model()
    }

    fun pass_model_to_view(){
        m_view.Get_Model_View(Get_model())
    }

}