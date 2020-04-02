package main.java.cashierDir.Statistics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Statistics<T> {

    //Henter alle get metoder
    public void getAllData(T genericObject) throws InvocationTargetException, IllegalAccessException {
        for (Method m : genericObject.getClass().getMethods()){
            if (m.getName().startsWith("get")){
                System.out.println(m.invoke(genericObject));
            }
        }
    }







}
