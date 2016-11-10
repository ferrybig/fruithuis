/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis.frames;

/**
 *
 * @author admin
 */
public interface TriFunction<A, B, C, R> {

	public R apply(A a, B b, C c);
	
}
