package br.unicamp.ic.sed.mobilemedia.main;

public privileged aspect FeatureLog {
	
	
	pointcut featureLogging():execution(public Object *..Manager.getProvidedInterface(String));

	after():featureLogging(){
		Object obj = thisJoinPoint.getTarget();
		System.out.println("======>"+obj.toString());
	}

}
