package com.bloc.securitypackages.apples;
import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.Color;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

abstract class Apple extends Fruit {
//@Override
public Apple(String name, int calories, Color color, Double weight) {
	super(name, calories, color,  weight);
}
	 abstract void bite();

}