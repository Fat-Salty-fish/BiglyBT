/*
 * Copyright (C) Azureus Software, Inc, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */
package com.biglybt.launcher;

import com.biglybt.launcher.classloading.PeeringClassloader;

/**
 * @author Aaron Grunthal
 * @create 28.12.2007
 */
public class LauncherTest {

	public static void main(String[] args) {

		System.out.println("current loader\t"+LauncherTest.class.getClassLoader());
		System.out.println("classloader's loader\t"+LauncherTest.class.getClassLoader().getClass().getClassLoader());
		System.out.println("classloader interface's loader\t"+PeeringClassloader.class.getClassLoader());

		if(LauncherTest.class.getClassLoader() instanceof PeeringClassloader)
			System.out.println("success");
		else
		{
			System.out.println("wrong classloader, invoking launcher");
			Launcher.launch(LauncherTest.class, args);
		}

	}

}