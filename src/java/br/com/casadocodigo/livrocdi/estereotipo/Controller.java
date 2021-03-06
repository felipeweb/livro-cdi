/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.casadocodigo.livrocdi.estereotipo;

import javax.enterprise.inject.Stereotype;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author gilliard
 */
@Stereotype
@Named @RequestScoped
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Controller {
    
}
