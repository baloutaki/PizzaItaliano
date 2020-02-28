package be.ehb.pizzaitaliano.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PizzaViewModel extends ViewModel {

    private MutableLiveData<Pizza> sharedPizza;
    private Pizza pizza;

    public PizzaViewModel() {
    }
    

}
