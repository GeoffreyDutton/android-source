package com.bloc.threads;

import java.net.URL;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;


public class Main extends Object {

	public static void main(String [] args) {
		ImageGetter imageGetter = new ImageGetter("google.com",true);

		/************************************************
		 *	ASSIGNMENT:
		 *	Perform the following block of code on a separate
		 *	Thread, use the ImageGetter class.
		/************************************************/


		/************************************************
		 *	ASSIGNMENT:
		 *	Perform the previous block of code on a separate
		 *	Thread, use the ImageGetter class.
		/************************************************/

		File logo = new File("google_logo.png");

		boolean exists = false;
		try {
			exists = logo.exists();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		if (exists) {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/* Download that image  */");
			System.out.println("/* on a separate thread */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/\n");
		} else {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/* Nice work, you pass! */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/\n");
		}
	}
}
