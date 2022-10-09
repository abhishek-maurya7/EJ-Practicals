/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mybeans;

import javax.ejb.Stateless;

/**
 *
 * @author Abhishek
 */
@Stateless
public class CCBean implements CCBeanLocal {
    @Override
    public double r2Dollar(double r)
    {
     return r/65.65; 
    }
    
    @Override
    public double d2Rupees(double d)
    {
     return d*65.65; 
    }
}
