/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package servlet;

import javax.ejb.Singleton;

/**
 *
 * @author Abhishek
 */
@Singleton
public class CounterServletHitsBean {
    private int hitcount;

    public int incrementAndGetHitCount()
        {
            return hitcount++;
    }
   
}

