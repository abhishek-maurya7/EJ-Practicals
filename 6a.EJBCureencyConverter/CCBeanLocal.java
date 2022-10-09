/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package mybeans;

import javax.ejb.Local;

/**
 *
 * @author Abhishek
 */
@Local
public interface CCBeanLocal {
    public double r2Dollar(double r);
    public double d2Rupees(double d);
}
