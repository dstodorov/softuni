package SoftUni.advancedMay.oop.reflection.exercises.barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // TODO: implement for problem 3

        Class clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
		Constructor ctor = clazz.getConstructor();

		return (Unit) ctor.newInstance();

        //throw new ExecutionControl.NotImplementedException("message");


    }
}
