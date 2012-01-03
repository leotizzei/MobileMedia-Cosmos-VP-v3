package br.unicamp.ic.sed.mobilemedia.filesystemmgr_connector_VP.impl;



public class ComponentFactory {

	private static IManager manager = null;

	public static IManager createInstance(){
	
		if (manager==null)
			manager = new Manager();
		
		return manager;
	}
}



