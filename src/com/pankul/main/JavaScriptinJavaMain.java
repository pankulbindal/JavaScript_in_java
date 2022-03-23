package com.pankul.main;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptinJavaMain {

	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		String script = "var id='1'; id; ";
		try {
			Object result = engine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println(e.toString());
		}
	}

}
